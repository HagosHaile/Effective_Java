package ch3.objectmethods.equalsandequalsOperator;

public class EqualsExample {
	
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj1 = new Object();
		System.out.println("=====================================");
		//compare the hashCode of two equal objects.
		System.out.println(obj.hashCode());
		System.out.println(obj.hashCode());
		System.out.println("=====================================");
		EqualsExample ob = new EqualsExample();
		System.out.println(ob.checkEquals(obj, obj1));
		System.out.println(ob.checkEquality(obj, obj1));
		
		
		System.out.println("=====================================");
		Integer num = new Integer(23);
		Integer num1 = new Integer(23);
		System.out.println(num.equals(num1));
		System.out.println(num == num1);
		
		System.out.println("=====================================");
		Integer num2 = num;
		System.out.println(num.equals(num2));
		System.out.println(num == num2);
		System.out.println("=====================================");
		

	}
	private  boolean checkEquals(Object obj2, Object obj3) {
		return obj2.equals(obj2);
		
		
	}
	private  boolean checkEquality(Object obj2, Object obj3) {
		return (obj2 == obj3);
		
		
	}


}
