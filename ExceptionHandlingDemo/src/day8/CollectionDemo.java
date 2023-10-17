package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/*
 * Collection (I) - represent a group of elements as a single entity
 *   List(I)
 *     ArrayList(C)
 *           - insertion order to be maintained
*             - duplicates allowed
*             - null values are allowed
*             - Heterogeneous elements are allowed
*             - Based on Dynamic array
*             - re-sizable
*             - methods are not synchronized
*             - not thread safe
*             - can be accessed using index
*             - initial capacity - 10
*             - incremental capacity - (current capacity * 3/2)+1
*             - frequent operation retrieval
*             - able to access elements randomly
 *     LinkedList(C)
 *            - LinkedList internally uses a doubly linked list to store the elements.
 *            - Manipulation with LinkedList is faster than ArrayList
 *            - LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
 *            - No default capacity
 *            
 *     Vector(C) - 1.0v - legacy classes
 *            - Vector is synchronized
 *            - A Vector can use the Iterator interface or 
 *                 Enumeration interface to traverse the elements.
 *            - Vector is slow because it is synchronized
 *            - incremental capacity double
 *         Stack(C)
 *     
 *   Set(I)
 *  
 *   Queue(I)
 *   
 * Map(I)
 *  
 * 
 */
public class CollectionDemo {

	public static void main(String[] args) {
		// ArrayList
		/*
		 * Insertion order maintained
		 * Duplicates allowed
		 * null values allowed
		 * Read operations
		 */
		List lst = new ArrayList();
		lst.add(100);
		lst.add(200);
		lst.add(100);
		lst.add(200);
		lst.add(null);
		lst.add("abc");
		lst.add(10.02f);
		lst.add(new Employee(1000, "Raj"));
		
		
		// Read
		//for, foreach, Iterator, ListIterator
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println();
		System.out.println();
		for(Object el:lst) {
			if(el instanceof Integer || el instanceof Float) {
				System.out.println(el);
			} else if(el instanceof String) {
				String str = (String)el;
				System.out.println(str.length());
			} else if(el instanceof Employee) {
				Employee emp = (Employee)el;
				System.out.println(emp.getName());
			}
		}
		         
		// Generics - Homogeneous element
		IntegerList<> lst2 	= new Stack<>();// loose coupling
		
	
		//ArrayList arrList = new ArrayList(); // tight coupling
		
		lst2.add(1000);
		lst2.add(2000);
		lst2.add(3000);
		
		System.out.println();
		System.out.println();
		
		for(Integer el:lst2) {
			System.out.println(el);
		}
		System.out.println();
		System.out.println();
		
		// Iterator - create Iterator obj using iterator()
		//  read elements from left to right
		Iterator<Integer> itr = lst2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		// ListIterator - applicable for List
		//  we can read elements from both directions left-right/right-left
		
		ListIterator<Integer> lstIterator 
								= lst2.listIterator();
		
		System.out.println();
		
		// read from left to right
		while(lstIterator.hasNext()) {
			System.out.println(lstIterator.next());
		}
		
		System.out.println();
		
		// read from right to left
		while(lstIterator.hasPrevious()) {
			System.out.println(lstIterator.previous());
		}
		
		
		
		System.out.println(lst2.subList(0, 2));
		
		
		//
		
		

	}

}
