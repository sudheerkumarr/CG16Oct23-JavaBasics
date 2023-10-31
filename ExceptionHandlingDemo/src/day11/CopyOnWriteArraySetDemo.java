package day11;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * *
* CopyOnWriteArraySet
* Collection(I) <- Set(I) <- CopyOnWriteArraySet(C)
* Thread Safe
* Internally implements CopyOnWriteArrayList
* An update operation will be performed on cloned copy and there is no
*      effect on threads which are performing read operation.
* At certain point of time JVM  will synchronized both automatically
* Creates clone copy for every update operation.
* CopyOnWriteArraySet Can't perform remove operation while iterating  - UnsupportedOperationException
* Insertion Order preserved
* Duplicates not allowed
* 
* Constructors
*  CopyOnWriteArraySet();
*  CopyOnWriteArraySet(Collection c);
*  
*
* Methods
*  add()
*  addAll()
*  remove()
 */
public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("A");
		s.add("B");
		System.out.println(s); // [A, C, D, B]
		
		s.remove("D");
		System.out.println("Before remove");
		System.out.println(s); // [A, C, B]
				
		
		// Remove operation can't perform while iterating CopyOnWriteArraySet
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			String str = (String)itr.next();
			if(str.equals("A")) {
				itr.remove(); //java.lang.UnsupportedOperationException
			}
		}
		
		System.out.println("After remove");
		System.out.println(s);

	}
}
