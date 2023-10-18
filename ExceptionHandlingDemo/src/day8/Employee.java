package day8;

import java.util.Objects;

public class Employee {

	// Fields
	private int empId;
	private String name;
	
	// Constructor
	public Employee() {
		super();
	}
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	// Getters & Setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
