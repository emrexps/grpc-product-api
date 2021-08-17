package com.emreeker.product.server;

import java.io.IOException;

import com.emreeker.product.service.ProductService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ProductServer {
	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(9090).addService(new ProductService()).build();
		server.start();
		System.out.println("server started");
		server.awaitTermination();
	}

}
