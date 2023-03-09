package com.microservice.project4.payload.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ProductRequest {
	
	String  name;
	long    price;
	long   quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}
