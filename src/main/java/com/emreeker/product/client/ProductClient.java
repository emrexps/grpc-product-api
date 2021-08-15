package com.emreeker.product.client;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest;
import com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse;
import com.emreeker.product.stub.ProductOuterClass.EmptyRequest;
import com.emreeker.product.stub.ProductOuterClass.ManyProductRequest;
import com.emreeker.product.stub.ProductOuterClass.ManyProductResponse;
import com.emreeker.product.stub.ProductOuterClass.Product;
import com.emreeker.product.stub.ProductOuterClass.ProductRequest;
import com.emreeker.product.stub.ProductOuterClass.ProductResponse;
import com.emreeker.product.stub.ProductServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ProductClient {

    public static void main(String[] args) {
        ProductClient main = new ProductClient();
        main.run();
    }

    private void run() {
    	
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
      
        System.out.println("SEND ONE REQUEST");
        sendOneRequestAtOnce(channel);
        System.out.println("------------");
        System.out.println("SEND MANY REQUEST");
        sendManyRequestAtOnce(channel);
        System.out.println("------------");
        System.out.println(" LIST ALL PRODUCTS (server returns one-by-one) ");
        listAllProductsFromApi(channel);
        System.out.println("------------");
        System.out.println("REMOVE PRODUCT WITH ID 2");
        removeFromDb(channel);
        System.out.println("------------");
        System.out.println("LIST ALL PRODUCTS AFTER REMOVING");
        listAllProductsFromApi(channel);
        channel.shutdown();
    }

	private void sendOneRequestAtOnce(ManagedChannel channel) {
		
		ProductServiceGrpc.ProductServiceBlockingStub productClient 
		              = ProductServiceGrpc.newBlockingStub(channel);

        Product product = Product.newBuilder()
        		.setId(1)
               .setProductName("MyPhone11")
               .setDescription("Super Phone")
               .setPrice(3000)
                .build();

        
        ProductResponse response = productClient.addProduct(
        		ProductRequest.newBuilder()
                       .setProduct(product)
                        .build()
        );
        
        System.out.println(response.getResponsemessage());
	}
	
private void removeFromDb(ManagedChannel channel) {
		
		ProductServiceGrpc.ProductServiceBlockingStub productClient 
		              = ProductServiceGrpc.newBlockingStub(channel);

		DeleteProductRequest request=DeleteProductRequest.newBuilder().setProductId(2).build();
		DeleteProductResponse response= productClient.deleteProduct(request);
        System.out.println(response.getResponsemessage());
	}

	private void sendManyRequestAtOnce(ManagedChannel channel) {
		ProductServiceGrpc.ProductServiceStub asyncClient = ProductServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ManyProductRequest> requestObserver = asyncClient.sendManyProduct(new StreamObserver<ManyProductResponse>() {
            @Override
            public void onNext(ManyProductResponse value) {
            	System.out.println("Response from server");
                System.out.println(value.getResponsemessage());
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });
        
        requestObserver.onNext(ManyProductRequest.newBuilder()
                .setProduct(Product.newBuilder()
                		.setId(2)
                        .setProductName("MyPhone12")
                        .setDescription("New MyPhone12")
                        .setPrice(4000)
                        .build())
                .build());
  
        requestObserver.onNext(ManyProductRequest.newBuilder()
                .setProduct(Product.newBuilder()
                		.setId(3)
                        .setProductName("MyConsole")
                        .setDescription("My Console Description")
                        .setPrice(2500)
                        .build())
                .build());
    
        requestObserver.onCompleted();
        try {
            latch.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	private void listAllProductsFromApi(ManagedChannel channel) {
		
        ProductServiceGrpc.ProductServiceBlockingStub greetClient = ProductServiceGrpc.newBlockingStub(channel);
        EmptyRequest requestProductsFromDb =
        		EmptyRequest.newBuilder()       
                        .build();
        
        greetClient.sendProductList(requestProductsFromDb)
                .forEachRemaining(productList -> {
                    System.out.println(productList.getProduct().getProductName()+" "+productList.getProduct().getPrice()+" "+productList.getProduct().getDescription());
                });
    }

}
