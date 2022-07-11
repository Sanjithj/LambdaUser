package com.bridgelabz;

public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;

	CustomException(String message){
    	System.out.println(message);
    }
}
