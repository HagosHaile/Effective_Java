/**
 * 
 */
package ch3.objectmethods.clonemethod;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author HAGOS
 *
 */
class Employee implements Cloneable {
	public Employee(String str, double dou) {
		name = str;
		salary = dou;
	}

	/*
	 * object classes clone method is protected native class. the overriding method
	 * in any subclass should be ==============protected native Object clone()
	 * throws CloneNotSupportedException;======================= any update in the
	 * cloned Object will not be reflected in the original object and vice versa. In
	 * reference assignment any update in the assignee will affect the original and
	 * vice versa.
	 * =============================================================================
	 * ======================== Deep Copy vs Shallow Copy
	 *
	 * Shallow copy is method of copying an object and is followed by default in
	 * cloning. In this method the fields of an old object X are copied to the new
	 * object Y. While copying the object type field the reference is copied to Y
	 * i.e object Y will point to same location as pointed out by X. If the field
	 * value is a primitive type it copies the value of the primitive type.
	 * Therefore, any changes made in referenced objects in object X or Y will be
	 * reflected in other object. Shallow copies are cheap and simple to make. In
	 * above example, we created a shallow copy of object.
	 *
	 * Usage of clone() method – Deep Copy
	 * 
	 * If we want to create a deep copy of object X and place it in a new object Y
	 * then new copy of any referenced objects fields are created and these
	 * references are placed in object Y. This means any changes made in referenced
	 * object fields in object X or Y will be reflected only in that object and not
	 * in the other. In below example, we create a deep copy of object. A deep copy
	 * copies all fields, and makes copies of dynamically allocated memory pointed
	 * to by the fields. A deep copy occurs when an object is copied along with the
	 * objects to which it refers.
	 * 
	 * 
	 * Advantages of clone method:
	 * 
	 * If we use assignment operator to assign an object reference to another
	 * reference variable then it will point to same address location of the old
	 * object and no new copy of the object will be created. Due to this any changes
	 * in reference variable will be reflected in original object. If we use copy
	 * constructor, then we have to copy all of the data over explicitly i.e. we
	 * have to reassign all the fields of the class in constructor explicitly. But
	 * in clone method this work of creating a new copy is done by the method
	 * itself. So to avoid extra processing we use object cloning.
	 */
	public Object clone() {
		try {
			Employee cloned = (Employee) super.clone();
			cloned.hireDay = (Date) hireDay.clone();
			return cloned;
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
			return null;
		}
	}

	public void setHireDay(int year, int month, int day) {
		hireDay = new GregorianCalendar(year, month - 1, day).getTime();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String toString() {
		return "name: " + name + ", salary: " + salary + ", hireDay: " + hireDay;
	}

	private String name;
	private double salary;
	private Date hireDay;
}