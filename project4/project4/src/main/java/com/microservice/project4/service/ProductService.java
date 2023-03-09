package com.microservice.project4.service;

import com.microservice.project4.payload.request.ProductRequest;
import com.microservice.project4.payload.response.ProductResponse;

public interface ProductService {
 
	public long addProduct(ProductRequest productRequest);
	
	public ProductResponse getProductById(long ProductId);
	
	public void deleteProductById(long productId);
}
