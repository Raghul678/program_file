package com.microservice.project4.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.microservice.project4.dto.Product;
import com.microservice.project4.exception.ProductServiceCustomException;
import com.microservice.project4.payload.request.ProductRequest;
import com.microservice.project4.payload.response.ProductResponse;
import com.microservice.project4.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2//
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;

	@Override
	public long addProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		Product product =Product.builder()
				.productName(productRequest.getName())
				.quantity(productRequest.getQuantity())
				.price(productRequest.getPrice())
				.build();
		product = productRepository.save(product);
		return product.getProduct_id();
	}

	@Override
	public ProductResponse getProductById(long ProductId) {
		// TODO Auto-generated method stub
		Product product= productRepository.findById((int)ProductId)
         .orElseThrow(
        		 () -> new ProductServiceCustomException("Product with the given Id is not found","PRODUCT_NOT_FOUND"));
	ProductResponse productResponse =new ProductResponse();
			BeanUtils.copyProperties(product, productResponse);
	return productResponse;
		
	}

	@Override
	public void deleteProductById(long productId) {
		// TODO Auto-generated method stub
		if(!productRepository.existsById((int)productId))
{ throw new ProductServiceCustomException("Product with given ID"+productId+ "is not found","PRODUCT_NOT_FOUND");
	}
else
{
	productRepository.deleteById((int) productId);
}
 }
   
}
	
	
		
		
	
	
		
		
	
	

		
	
	


