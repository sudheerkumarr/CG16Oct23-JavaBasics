package pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * keywords
 * try, catch, finally, throw, throws
 */

public class ExceptionHandling {

	// public ExceptionHandling() {}

	String str6 = "Hello"; // null
	int x;// 0
	double y; // 0.0

	static int z;//

	static FileInputStream fis;
	static FileOutputStream fos;
	
	public static void main(String[] args) throws CustomerNotFoundException {

		/*
		 * ByteStream - 8bits FileInputStream - read input from a file FileOutputStream
		 * - write content into file
		 * 
		 * Character Stream - 16 bit FileReader(C) - read content from file
		 * FileWriter(C) - write content to a file
		 * 
		 */
	
		
		try {
			 fis = new FileInputStream("d:/source.txt");
			 fos = new FileOutputStream("d:/target.txt");
			int x;

			while ((x = fis.read()) != -1) {
				fos.write(x);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		System.out.println(getCustomerByName("Raj"));

		try {
			m1(); // NumberFormatExcetion
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		// String str5= "asdf";

		// access non-static variables
		ExceptionHandling exObj = new ExceptionHandling();
		System.out.println(exObj.str6);

		// access static variables
		System.out.println(z);
		System.out.println(ExceptionHandling.z);
		System.out.println(exObj.z);

		try {
			System.out.println(exObj.str6.length());// NullPointerException
			System.out.println(exObj.str6.charAt(10)); // StringIndexOutOfBoundsException

		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println(exObj.str6.length());// NullPointerException
			System.out.println(exObj.str6.charAt(10)); // StringIndexOutOfBoundsException
			System.out.println("Inside try block");
		} catch (NullPointerException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("finally block");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Outside try block");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firstNumber");
		int num1 = sc.nextInt();
		System.out.println("Enter secondNumber");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
		/*
		 * if(num2 != 0 ) { System.out.println(num1/num2); } else {
		 * System.out.println("Enter non-zero value"); }
		 */

		// Arrays
		// int[] numArr = new int[3];
		// int[] numArr = {10, 10, 20, 30};
		int[] numArr = new int[] { 10, 20, 30, 40 };

		System.out.println(numArr.length);// 4

		System.out.println(numArr[3]); // 40

		System.out.println(numArr[3]); // ArrayIndexOutOfBoundsException

		String str1 = "Hello World!"; // SCP
		String str2 = new String("Hello World!"); // Heap
		try {
			System.out.println(str1.charAt(11));// StringIndexOutOfBoundsException
		} catch (Exception e) {
			e.printStackTrace();
		}

	};// main

	static void m1() throws NumberFormatException {

		m2();

	}

	static void m2() throws NumberFormatException {

		m3();

	}

	static void m3() throws NumberFormatException {

		Integer.parseInt("10"); // 10
		Integer.parseInt("abc"); // NumberFormatException
	}

	static Customer getCustomerByName(String name) throws CustomerNotFoundException {
		throw new CustomerNotFoundException("Customer not found with given name.");
	}
}
