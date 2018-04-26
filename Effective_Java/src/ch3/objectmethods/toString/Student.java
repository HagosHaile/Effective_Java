package ch3.objectmethods.toString;

public class Student {
	private String name;
	private String program;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student Information: \nName: " + name + ", Program: " + program + ", Age: " + age ;
	}
	
	

}
