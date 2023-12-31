package day8;
/*
 * Wrapper Classes
 * ================
 * 
 * primitive data type - 8 types
 *  int, long , short , byte, boolean, char, float, double
 *  
 *  
 * Serialization/Collections/Synchronization/Cloning
 * 
 * java.lang pkg provides all wrapper classes
 * 
 * int  - java.lang.Integer
 * long - java.lang.Long
 * double - Double
 * short - Short
 * byte - Byte
 * boolean - Boolean
 * char - Character
 * float - Float
 * 
 * 
 * convert primitive to Object
 *   - valueOf() - method 
 *   - Autoboxing
 *  
 * convert Object to primitive
 *   - xxxValue()
 *   - Autounboxing 
 *  
 * Converting Wrapper Obj to String
 *  - toString()
 * 
 * Converting String to Wrapper Obj
 *   - valueOf()
 * 
 * 
 *  Primitive to String 
 *	 - valueOf()
 *	
 *	String to primitive data types
 *	 -  parseInt(), parseDouble()
 */


public class WrapperDemo {

	public static void main(String[] args) {
		// primitive data type
		int x = 10;
		
	
		// primitive to Obj - valueOf()
		Integer i1 = Integer.valueOf(x);
		
		System.out.println(i1.getClass().getName());
		
		
		// Autoboxing
		Integer i2 = 100;
		System.out.println(i2.getClass().getName());
		
		
		// Wrapper Object to primitive
		int i3 = i1.intValue();
		
		
		// Autounboxing
		int i4 = i2;
		
		// Wrapper Obj to String
		String str = i1.toString(); // 10
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.getClass().getName());
		
		// String to wrapper Obj
		Integer i5= Integer.valueOf(str);
		System.out.println(i5); //10
		
		System.out.println(i5.getClass().getName());
		
		// String to primitive
		int i6 = Integer.parseInt(str);
		System.out.println(i6);//10
		
		// typecasting
		byte b = 100; // 8bits
		short s = b; // 16 bits
		
		
		float f = 100.012f;
		int x2 = (int)f;
		
		double d = f;
		
		System.out.println(f);
		System.out.println(x2);
		System.out.println(d);
		
//		Object obj = new Object();
//		Employee emp = (Employee)obj;
//		
//		Student std= new Student();
//		Object obj2 = std;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
