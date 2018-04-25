/**
 * 
 */
package ch3.objectmethods.overrideequalsandhashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HAGOS
 *
 */
public class HashcodeAndEqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Employee, String> empMap = new HashMap<Employee, String>();
		Employee emp1 = new Employee("John", 23, "Bangalore");
		Employee emp4 = new Employee("John", 23, "Bangalore");
		Employee emp2 = new Employee("Max", 29, "Chennai");
		empMap.put(emp1, "John details");
		empMap.put(emp2, "Max details");
		System.out.println(emp1);
		System.out.println(emp2);
		Employee emp3 = new Employee("John", 23, "Bangalore");
		System.out.println(empMap.get(emp3));
		
		/*****************************************************************************************************
		*	The hashcode() and equals() methods contract can be summarized as below;						 *
		*	1. If two objects are equal by equals() method then their hash code values must be same.         *
		*	2. If two objects are not equal by equals() method then their hash code may be same or different.*
		*	if you override equals methods you must override hashCode method                                 *
		*****************************************************************************************************/	
		System.out.println(emp1.equals(emp2));
		// this == obj for emp1.equals(emp2) means this is for empl1 and obj is for emp2.
		System.out.println(emp1.equals(emp4));

	}

}
