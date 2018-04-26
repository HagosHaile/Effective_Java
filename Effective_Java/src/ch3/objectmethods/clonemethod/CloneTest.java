/**
 * 
 */
package ch3.objectmethods.clonemethod;

/**
 * @author HAGOS
 *
 */
public class CloneTest{
	  public static void main(String[] args){

	  Employee emp = new Employee("Amardeep", 50000);
	  emp.setHireDay(2005,0,0);
	  Employee emp1 = (Employee)emp.clone();
	  System.out.println("======================================================================");
	  System.out.println("Copy before modification of fields:\n" + emp1);
	  emp1.raiseSalary(20);
	  emp1.setHireDay(2008, 12, 31);
	  System.out.println("======================================================================");
	  System.out.println("orgional Employee object before modification:\n " + emp);
	  System.out.println("======================================================================");
	  System.out.println("copy after modification " + emp1);
	  System.out.println("======================================================================");
	  emp.setHireDay(2018, 01, 01);
	  emp.raiseSalary(40);
	  System.out.println("Employee object after modification:\n " + emp);
	  System.out.println("======================================================================");
	  System.out.println("copy after modification of origional Employee object" + emp1);
	  System.out.println("======================================================================");
	  }
	}