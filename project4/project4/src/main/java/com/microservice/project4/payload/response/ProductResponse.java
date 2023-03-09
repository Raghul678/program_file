package com.microservice.project4.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductResponse {
	
	private int product_id;
	private String product_name;
	private long price;
	private long quantity;

}
