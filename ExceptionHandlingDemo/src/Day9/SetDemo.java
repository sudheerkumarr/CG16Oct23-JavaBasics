package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 *   Set(I) - Iterator, for
 *     HashSet(C)
 *     LinkedHashSet(C)
 *     SortedSet(I)
 *       NavigableSet(I)
 *         TreeSet(C)
 *        
 *   - duplicates not allowed
 *   - insertion order won't maintain
 *   - null - depending on implementation class.
 *   
 */
public class SetDemo {

	public static void main(String[] args) {
		
		Set hs = new HashSet();
		//HashSet hs = new HashSet();
		
		hs.add("aa");
		hs.add(true);
		hs.add(1000);
		hs.add("aa");
		hs.add(true);
		hs.add(1000);
		hs.add(null);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		HashSet<Integer> hs2 = new HashSet();
		hs2.add(100);
		hs2.add(200);
		hs2.add(100);
		hs2.add(null);
		hs2.add(200);
		
		System.out.println(hs2);
		hs2.remove(null);
		System.out.println(hs2);
		
		for(Integer e:hs2) {
			System.out.println(e);
		}
		
		System.out.println("##########LinkedHashSet");
		// LinkedHashSet(C) 
		Set hs3 = new LinkedHashSet();
		
		
		hs3.add("aa");
		hs3.add(true);
		hs3.add(1000);
		hs3.add("aa");
		hs3.add(true);
		hs3.add(1000);
		hs3.add(null);
		
		
		Iterator itr3 = hs3.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		System.out.println();
		LinkedHashSet<Integer> hs4 = new LinkedHashSet();
		hs4.add(100);
		hs4.add(200);
		hs4.add(100);
		hs4.add(null);
		hs4.add(200);
		
		System.out.println(hs4);
		hs4.remove(null);
		System.out.println(hs4);
		
		for(Integer e:hs4) {
			System.out.println(e);
		}
		
		
		// TreeSet(C)
		/*
		 * Duplicates wont allow
		 * null values wont allow
		 * store elements in sorting order
		 * 
		 */
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(300);
		ts.add(100);
		ts.add(200);
		//ts.add(null);
		ts.add(400);
		ts.add(300);
		ts.add(100);
		ts.add(200);
		//ts.add(null);
		ts.add(400);
		
		System.out.println(ts);
		
		
		Employee emp1 = new Employee(1001, "Ram");
		Employee emp2 = new Employee(1004, "Sam");
		Employee emp3 = new Employee(1003, "Raj");
		Employee emp4 = new Employee(1001, "Ram");
		
		Set<Employee> ts2 = new HashSet<>();
		ts2.add(emp1);
		ts2.add(emp3);
		ts2.add(emp2);
		ts2.add(emp4);
		
		System.out.println(emp1.hashCode()); //2054798982
		System.out.println(emp2.hashCode()); //191382150
		System.out.println(emp3.hashCode()); //885951223
		System.out.println(emp4.hashCode()); // 142666848
		System.out.println(ts2);
		
		// Override hashcode & equals method in employee class
		
		
		System.out.println(emp1.hashCode()); //113910
		System.out.println(emp2.hashCode()); //114964
		System.out.println(emp3.hashCode()); //113969
		System.out.println(emp4.hashCode()); // 113910
		
		System.out.println(ts2); 
		  //[Employee [empId=1003, name=Raj], Employee [empId=1004, name=Sam], Employee [empId=1001, name=Ram]]
		
		
		// Scenario 3:
		Set<Employee> ts3 = new TreeSet<>();
		ts3.add(emp1);
		ts3.add(emp3);
		ts3.add(emp2);
		ts3.add(emp4);
		
		System.out.println(ts3); // ClassCastException
		
		// Use Comparable(I) or Comparator(I)

	}

}
