package ch12.serialization.demo;

public class Employee implements java.io.Serializable {
	private static final long serialVersionUID = -3130583927284351054L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}