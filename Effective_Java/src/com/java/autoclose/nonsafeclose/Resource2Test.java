package com.java.autoclose.nonsafeclose;


public class Resource2Test {

	public static void main(String[] args) {
		try (Resource1 r = new Resource1()){
			System.out.println("Inside Resource 2 Test TRY block.");
			throw new IllegalStateException();
		}
	}
}