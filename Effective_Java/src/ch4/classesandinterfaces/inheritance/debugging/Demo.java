package ch4.classesandinterfaces.inheritance.debugging;

public class Demo {

	public static void main(String[] args) {
		Student st = new Student("Tim");
		st.setAge(22);
		st.setProgram("undergrad");
		
		Student st2 = new Student();
		st2.setName("hagos");
		st2.setAge(25);
		st2.setProgram("postgraduate");


	}

}
