package com.microservice.project4.exception;

import lombok.Data;

@Data
public class ProductServiceCustomException extends RuntimeException {
	
	private String errorCode;
	
	public ProductServiceCustomException(String message,String errorCode)
	
	{
		super(message);
		this.errorCode=errorCode;
		
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
