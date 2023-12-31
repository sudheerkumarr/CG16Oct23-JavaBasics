package day10;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Java 8 features:
 * =================
 * Lambda Expressions
 * 
 * Functional Interface -
 *  interface with single abstract method is called
 *     functional interface
 *     
 *   Rules for writing lambda expressions
 *      1. method return type not required
 *      2. method name not required
 *      3. {} & 'return' keyword not required if method
 *         body is having only one statement.
 *      4. input args data type not required
 *      5. insert '->' between input args & method body
 *      6. {} & 'return' keyword required when method body having more than one statement.
 *      
 * Predefined functional interfaces in java
    java.util.function - pkg
    1. Consumer - takes one input value - it won't return any value
       public abstract void accept(T);
       ex:
       void greet(String name) {
          System.out.println("Hello "+name);
       }
    2. Supplier  - it won't take any input, but it will return some value
       public abstract T get();
       ex:
       - generate 6 digit random number
       int generate() {
          return Math.round(Math.random()*1000000)); // 0-1 - 0.23456788812313
       }
    3. Function - takes one input value and returns some value
       public abstract R apply(T);

       ex: square numbers present in an array
       int[] squareArr(int[] intArr)

    4. Predicator - it will take input and returns boolean value
       public abstract boolean test(T);

       ex: boolean isEven(int num);
 * 
 * 
 */

/*

class Calc {
	int add(int x, int y) {
		return x+y;
	}
	String greet() {
		return "Hello World!";
	}
	
	Math.random() ;// 0-1
	// ()->"Hello World!";
	boolean isEven(int num) {
//		if(num%2==0) {
//		  return true;
//		}
//		return false;
 		//num%2==0?true:false
	}
	
	num -> {
	
	if(num%2==0) {
		return true;
	}
	return false;
	
	}
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(10, 20));

	}

}
*/
// Step 1 - create functional interface with single abstract
//            method
@FunctionalInterface
interface Intf1 {
	int add(int x, int y);
}

@FunctionalInterface
interface Intf2 {
	String greet();
}

@FunctionalInterface
interface Intf3 {
	boolean isEven(int num);
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// lambda expression
		Intf1 a = (x,  y) -> x+y;
		
		System.out.println(a.add(10, 20));
		
		// multiply two numbers
		Intf1 m = (x,y)->x*y;
		System.out.println(m.add(10, 10)); // 100
				
		//Scenario 2:  no intput arguments & return type is String
		Intf2 g = ()->"Hello World!";
		System.out.println(g.greet());
		
		// Scenario 3: isEven
		Intf3 even = num -> {
			
			if(num%2==0) {
				return true;
			}
			return false;
			};
			
		System.out.println(even.isEven(9));
		
		// Consumer
		Consumer greet = name->System.out.println("Hello "+name);
		greet.accept("Raj");
		
		// Supplier
		// System.out.println(Math.round(Math.random()*1000000));
		Supplier genRandom= 
				()->Math.round(Math.random()*1000000);
		System.out.println(genRandom.get());
		
		// Function -
		Function sq= num->(int)num*(int)num;
		System.out.println(sq.apply(10));
		
		int[] intArr = {10, 20, 30, 40};
		Function sqArr = nums -> {
			// converting object to array
			int[] n=(int[])nums;
			// create new array
			int[] newArr = new int[n.length];
			for(int i=0; i<n.length;i++) {
			  //square num and add in new array
				int result = n[i] * n[i];
				newArr[i]=result;	
			}
			return newArr;
		};
		
		System.out.println(Arrays.toString((int[])sqArr.apply(intArr)));
		
//		int square(int num) {
//			return num*num;
//		}
		// Function sq= num->num *num;
		
		// sq.apply(10);
		
//		int[] intArr = {10, 20, 30, 40};
//		int[] square(int[] nums) {
//		 
//			// create new array
//			int[] newArr = new int[nums.length];
//			for(int i=0; i<nums.length;i++) {
//			  //square num and add in new array
//				int result = nums[i] * nums[i];
//				newArr[i]=result;	
//			}
//			return newArr;
//		}
		
		
		
		
		
		
		
		
		
		
	} ;// main

} ;// class