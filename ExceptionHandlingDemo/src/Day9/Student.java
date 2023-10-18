package Day9;

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
	void setRollNo(int rNo) {
		this.rollNo=rNo;
	}
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	
	// Getters
	int getRollNo() {
		return this.rollNo;
	}
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}


	@Override
	public String toString() {
		return rollNo +" | "+ name;
	}
	
	
}
