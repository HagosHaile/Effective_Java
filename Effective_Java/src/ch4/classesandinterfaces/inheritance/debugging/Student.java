package ch4.classesandinterfaces.inheritance.debugging;

public class Student extends Person{
	private String name;
	private int age;
	private String program;
	public Student() {
		
		
	}
	public Student(String name) {
		super(name);
	}
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return super.getAge();
	}

	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	
	
	

}
