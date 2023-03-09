package com.microservice.project4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.project4.payload.request.ProductRequest;
import com.microservice.project4.payload.response.ProductResponse;
import com.microservice.project4.service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/product")
public class ProductController {
	ProductService productService;
  @PostMapping
  public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest)
  {
	long productId=productService.addProduct(productRequest);
	return new ResponseEntity<>(productId,HttpStatus.CREATED);
  }
   @GetMapping("/{id}")
   public ResponseEntity<ProductResponse>getProductById(@PathVariable("id")long productId)
   {
	   ProductResponse productResponse =productService.getProductById(productId);
	   return new ResponseEntity<ProductResponse>(productResponse ,HttpStatus.OK);
   }
   @DeleteMapping("/{id}")
   public void deleteById(@PathVariable("id")long productId)
   {
	   productService.deleteProductById(productId);
   }
}
