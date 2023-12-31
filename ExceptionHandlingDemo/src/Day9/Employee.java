package day9;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String name;
	
	// Constructors
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


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(empId, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(name, other.name);
	}


	@Override
	public int compareTo(Employee emp) {
		
		// +1 , -1 or zero
		// Sorting based on empId
		// asc order
		//return this.empId>emp.empId?1:-1;
		
		// desc order
		// return this.empId>emp.empId?-1:1;
		
		// Sorting based on name
		// asc order
		// return this.name.compareToIgnoreCase(emp.getName());
		
		// desc order
		return emp.getName().compareToIgnoreCase(this.getName());
		
	}
	
	
}
