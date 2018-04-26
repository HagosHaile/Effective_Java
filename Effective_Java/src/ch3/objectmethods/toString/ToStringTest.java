package ch3.objectmethods.toString;

public class ToStringTest {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Jhon");
		st.setAge(23);
		st.setProgram("undergrad");
		/************************************************************************************************
		 * if toString() method is not overridden it an object reference returns the                    *
		 * toString method of Object class                                                              *
		 *	public String toString() {                                                                  *
	     *  	return getClass().getName() + "@" + Integer.toHexString(hashCode());                    *
	     *	}                                                                                           *
		*************************************************************************************************/
		System.out.println(st);

	}

}
