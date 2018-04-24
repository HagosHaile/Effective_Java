package com.java.autoclose.safeclose;

import com.java.autoclose.safeclose.Resource1;

public class Resource1Test {

	//Resource1 r = new Resource1() is the try with resource part.........
	public static void main(String[] args) {
		try (Resource1 r = new Resource1()){
			System.out.println("Inside Resource 1 Test TRY block.");
		}
		System.out.println("Inside Resource 1 Test.");
	}
}