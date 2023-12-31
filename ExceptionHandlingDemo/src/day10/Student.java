package day10;

public class Student {

	// Fields
	private int rollNo;
	private String name;
	private int age;
	
	// Constructor
	public Student() {}


	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name=name;
	}
	
	public Student(String name) {
		this.name=name;
	}
	
	
	// Getters & Setters
	public void setRollNo(int rNo) {
		this.rollNo=rNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	// Getters
	public int getRollNo() {
		return this.rollNo;
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

//
//	@Override
//	public String toString() {
//		return rollNo +" | "+ name;
//	}
	
	
}
