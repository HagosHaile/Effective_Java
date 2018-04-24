package com.java.autoclose;

public class Resource1 implements AutoCloseable {

	public Resource1() {}
	
	//closes resource after it is used.
	/*
	 * Java 7 has introduced the new interface AutoCloseable 
	 *	which defines a single close method. The interface implementations 
	 *	of AutoCloseable will in conjunction with the newly introduced try-with-resources 
	 *	statement provide a methodology to ensure that the resource is 
	 *	closed as soon as its operations are completed.
	 *
	 */
	@Override
	public void close() {
		System.out.println("Closing open resources in Resource 1.");
	}
}