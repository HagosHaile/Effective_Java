package ch2.creatingAndDestroyingObjects.com.java.autoclose.nonsafeclose;

public class Resource1 implements AutoCloseable {

	public Resource1() {	
	}
	
	@Override
	public void close() {
		System.out.println("Closing open resources in Resource 1.");
	}
}