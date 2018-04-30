package ch12.serialization.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	   public static void main(String [] args) {
	      Employee e = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("C:/Users/HAGOS/git/Effective_Java/Effective_Java/src/ch12/serialization/demo/employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	     /* ***************************************************************************************************************
	      * when the employee.ser is deserialized all return the same value as before serialized except SSN.          *
	      * this is because it is transient                                                                                *
	      *	  ===========output====================                                                                       *
	      *	  Deserialized Employee...                                                                                    *
	      *	  Name: Belay ali                                                                                             *
	      *	  Address: central ave                                                                         *
	      *	  SSN: 0                                                                                                      *
	      *	  Number: 101                                                                                                 *
	      *****************************************************************************************************************/
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("SSN: " + e.SSN); 
	      System.out.println("Number: " + e.number);
	   }
	}