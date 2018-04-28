package ch12.serialization.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	   public static void main(String [] args) {
	      Employee e = new Employee();
	      e.name = "Belay Ali";
	      e.address = "central ave";
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("C:/Users/HAGOS/git/Effective_Java/Effective_Java/src/ch12/serialization/demo/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in C:/Users/HAGOS/Desktop/java/employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }
	}