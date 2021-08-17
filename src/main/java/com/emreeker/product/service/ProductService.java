package com.emreeker.product.service;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.emreeker.product.entity.ProductEntity;
import com.emreeker.product.stub.ProductOuterClass.DeleteProductRequest;
import com.emreeker.product.stub.ProductOuterClass.DeleteProductResponse;
import com.emreeker.product.stub.ProductOuterClass.EmptyRequest;
import com.emreeker.product.stub.ProductOuterClass.ManyProductRequest;
import com.emreeker.product.stub.ProductOuterClass.ManyProductResponse;
import com.emreeker.product.stub.ProductOuterClass.Product;
import com.emreeker.product.stub.ProductOuterClass.ProductList;
import com.emreeker.product.stub.ProductOuterClass.ProductRequest;
import com.emreeker.product.stub.ProductOuterClass.ProductResponse;
import com.emreeker.product.stub.ProductServiceGrpc.ProductServiceImplBase;

import io.grpc.stub.StreamObserver;

public class ProductService extends ProductServiceImplBase {

	@Override
	public void deleteProduct(DeleteProductRequest request, StreamObserver<DeleteProductResponse> responseObserver) {
		
		Integer id=request.getProductId();
		removeFromDatabase(id);
		DeleteProductResponse.Builder response = DeleteProductResponse.newBuilder();
		response.setResponseCode(200).setResponsemessage(id+ " Removed from db ");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mypersisteneunit");
	EntityManager em = emf.createEntityManager();

	@Override
	public StreamObserver<ManyProductRequest> sendManyProduct(StreamObserver<ManyProductResponse> responseObserver) {
     	
		StreamObserver<ManyProductRequest> requestObserver = new StreamObserver<ManyProductRequest>() {
		
     		String productNames = "";
			
     		@Override
			public void onNext(ManyProductRequest value) {
				persistToDb(value.getProduct().getId(),value.getProduct().getProductName(), value.getProduct().getPrice(),
						value.getProduct().getDescription());
				productNames += "[" + value.getProduct().getProductName() + "] ";
			}

			@Override
			public void onError(Throwable t) {
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(ManyProductResponse.newBuilder().setResponsemessage(productNames).build());
				responseObserver.onCompleted();
			}
		};

		return requestObserver;
	}

	@Override
	public void sendProductList(EmptyRequest request, StreamObserver<ProductList> responseObserver) {
		try {
			List<ProductEntity> allProducts = findAllFromDb(em);
			for (ProductEntity p : allProducts) {
				ProductList response = ProductList.newBuilder().setProduct(Product.newBuilder()
						.setProductName(p.getProductName()).setDescription(p.getDescription()).setPrice(p.getPrice()))
						.build();

				responseObserver.onNext(response);
				Thread.sleep(1000L);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			responseObserver.onCompleted();
		}
	}

	@Override
	public void addProduct(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {

		Integer id=request.getProduct().getId();
		String product_name = request.getProduct().getProductName();
		Integer price = request.getProduct().getPrice();
		String description = request.getProduct().getDescription();

		persistToDb(id,product_name, price, description);

		ProductResponse.Builder response = ProductResponse.newBuilder();
		response.setResponseCode(0).setResponsemessage("SUCCESS");

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	private void persistToDb(Integer id,String product_name, Integer price, String description) {
		try {
			em.getTransaction().begin();

			ProductEntity product = new ProductEntity();
			product.setIdnum(id);
			product.setProductName(product_name);
			product.setDescription(description);
			product.setPrice(price);

			em.persist(product);

			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
		}

	}

	private <T> List<T> findAllFromDb(EntityManager em) {
		try {
			Query query = em.createNamedQuery("Products.findAll");
			return query.getResultList();

		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
		return Collections.emptyList();
	}
	
	private void removeFromDatabase(Integer id) {
		
		try {
			em.getTransaction().begin();
			ProductEntity productEntity=em.find(ProductEntity.class, id);
			em.remove(productEntity);
			
			em.getTransaction().commit();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
		
	}

}
