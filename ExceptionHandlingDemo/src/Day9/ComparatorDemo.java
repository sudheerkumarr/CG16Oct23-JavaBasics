package day9;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		//Student std1 = new Student(201, "Raj");
		Student std1 = new Student();
		std1.getRollNo();//0
		std1.getName();//null
		// setter methods to initialize values
		std1.setRollNo(201);
		std1.setName("Raj");
		
		Student std2 = new Student(202, "Sam");
		Student std4 = new Student(204, "Bob");
		Student std3 = new Student(203, "Ram");
		
		// sort by rollNo
//		SortByRollNo byRollNo= new SortByRollNo();
//		Set<Student> ts= new TreeSet<>(byRollNo); 
		
		// sort by name
		SortByName byName = new SortByName();
		Set<Student> ts= new TreeSet<>(byName);
		
		// Collections(C) - provide method to work with Collection(I)
		
		
		ts.add(std1); //ClassCastException
		ts.add(std3);
		ts.add(std2);
		ts.add(std4);
		
		System.out.println(ts);
		
		
		
		
		
		
		
		
		
	}

}
