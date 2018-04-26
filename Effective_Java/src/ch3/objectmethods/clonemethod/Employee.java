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
class Employee implements Cloneable{
	  public Employee(String str, double dou){
	  name = str;
	  salary = dou;
	  }
	  public Object clone(){
	  try{
	  Employee cloned = (Employee)super.clone();
	  cloned.hireDay = (Date)hireDay.clone();
	  return cloned;
	  }
	  catch(CloneNotSupportedException e){
	  System.out.println(e);
	  return null;
	  }
	  }
	  public void setHireDay(int year, int month, int day){
	  hireDay = new GregorianCalendar(year,month - 1, day).getTime();
	  }
	  public void raiseSalary(double byPercent){
	  double raise = salary * byPercent/100;
	  salary += raise;
	  }
	  public String toString(){
	  return "name: " + name+ ", salary: " + salary+ ", hireDay: " + hireDay;
	  }
	  private String name;
	  private double salary;
	  private Date hireDay;
	}