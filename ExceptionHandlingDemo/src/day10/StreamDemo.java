package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



/*
 * Stream API 
 * - used to process collection objects.
 * - A stream in Java is a sequence of objects 
 *    that supports various methods which
 *    can be pipelined to produce the 
 *    desired result.  
 */

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> intArr = new ArrayList<>();
		intArr.add(10);
		intArr.add(20);

		List<Integer> arrList = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 50, 60, 20, 35, 45, 60);

		// Square all numbers present in list
		// map - applying same function on each and every element.
		List<Integer> lst = arrList.stream().map(num -> num * num).collect(Collectors.toList());

		System.out.println(lst);

		// filter - filter elements based on condition

		// print even numbers
		Set<Integer> evenList = arrList.stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());
		System.out.println(evenList);

		// Odd List
		Set<Integer> oddList = arrList.stream().filter(num -> num % 2 != 0).collect(Collectors.toSet());
		System.out.println(oddList);

		// print number greater than 50
		Set<Integer> greaterThan50List = arrList.stream().filter(num -> num > 50).collect(Collectors.toSet());
		System.out.println(greaterThan50List);

		// sum all values present in list
		// reduce()
		Integer total = arrList.stream().reduce(0, (sum, el) -> sum + el);

		System.out.println(total);

		// find min
		Integer min = arrList.stream().min((n1, n2) -> n1 > n2 ? 1 : -1).get();
		System.out.println(min);

		// find max
		Integer max = arrList.stream().max((n1, n2) -> n1 > n2 ? 1 : -1).get();
		System.out.println(max);

		// sort - asc order
		List<Integer> sortedList = arrList.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedList);

		// sort - desc order
		List<Integer> descList = arrList.stream().sorted((n1, n2) -> n1 > n2 ? -1 : 1).collect(Collectors.toList());

		System.out.println(descList);

		// sorting student objects
		Student std2 = new Student(202, "Sam");
		Student std4 = new Student(204, "Bob");
		Student std3 = new Student(203, "Ram");
		
		List<Student> stdList = new ArrayList<>();
		stdList.add(std2);
		stdList.add(std4);
		stdList.add(std3);
		
		System.out.println(stdList);
		
		// sorting in asc order
		List<Student> ascList= stdList
			.stream()
			.sorted((s1, s2)->s1.getRollNo()>s2.getRollNo()?1:-1)
			.collect(Collectors.toList());
		System.out.println(ascList);
		
		// desc list
		List<Student> descList2= stdList
				.stream()
				.sorted((s1, s2)->s1.getRollNo()>s2.getRollNo()?-1:1)
				.collect(Collectors.toList());
			System.out.println(descList2);
			
		// count, distinct, average, allMatch, noneMatch, 
		// anyMatch, sum, flatMap
			
		// 20
			
		//[10, 20, [5, 10, 15], 40]
	    // [10, 20, 5, 10, 15, 40]	
				
				
				
				
			
			
		
		
		
		
		
		
		

	}

}
