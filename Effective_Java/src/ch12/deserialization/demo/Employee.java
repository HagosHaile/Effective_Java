package ch12.deserialization.demo;

public class Employee implements java.io.Serializable {
	private static final long serialversionUID = 129348938L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}