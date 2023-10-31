package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Collection -
 *   Vector & HashTable - 
 *   Collections -
 *      synchronizedList()
 *  	synchronizedSet()
 *  	synchronizedMap()
 *  
 *  Concurrent Collections:
 *  ------------- --------
 *  - More than one thread allowed to iterate
 *      
 *    
 * Advantages with Concurrent Collection:
 * 
 * 1. Thread safe
 * 2. Performance is high (different locking mechanism)
 * 3. Allows multiple threads to work on object in safe manner
 * 4. ConcurrentCollections won't throw ConcurrentModificationException
 *
 * java.util.concurrent pkg
 * Concurrent classes: best suitable for scalable multithreaded application
 * 1. ConcurrentHashMap
 * 2. CopyOnWriteArrayList (ArrayList behavior is on CopyOnWrite)
 * 3. CopyOnWriteArraySet 
 * 
 * Map(I)<-ConcurrentMap(I)<-ConcurrentHashMap(C)
 * ConcurrentMap(I) methods
 * 1. Object putIfAbsent(Object key, Object value) - add entry to map if specified key is not present
 * 2. boolean remove(Object key, Object value) - removes the entry only if key & value matches
 * 3. boolean replace(Object key, Object oldValue, Object newValue)

 * - Initial capacity of ConcurrentHashMap is 16 buckets (0-15).
 * - Thread wont require lock for read
 * - For update/write thread require lock
 * - bucket level locking mechanism used for allowing multiple threads
 *    instead of locking mechanism on whole object.
 * - 16 threads can work, one on each bucket at the same time
 * - default concurrency level - 16
 * - number of threads = concurrency level
 */
public class ConcurrencyDemo {

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Ram", 90);
		marks.put("Sam", 67);
		marks.put("Ravi", 89);
		marks.put("Ravi", 78);
		System.out.println(marks);//{Ravi=78, Sam=67, Ram=90}
		// remove
		marks.remove("Ravi");
		System.out.println(marks);//{Sam=67, Ram=90}
		// replace
		marks.replace("Sam", 80);
		System.out.println(marks); //{Sam=80, Ram=90}
		
		ConcurrentHashMap<String, Integer> cHashMap = new ConcurrentHashMap<>();
		
		cHashMap.putIfAbsent("Ram", 90);
		cHashMap.putIfAbsent("Ravi", 90);
		cHashMap.putIfAbsent("Sam", 90);
		cHashMap.putIfAbsent("Ram", 79);
		
		System.out.println(cHashMap);
		// remove
		cHashMap.remove("Ravi", 50);
		System.out.println(cHashMap); // {Ravi=90, Sam=90, Ram=90}
		cHashMap.remove("Ravi", 90);
		System.out.println(cHashMap); //{Sam=90, Ram=90}
		
		// replace
		cHashMap.replace("Sam", 100, 75);
		System.out.println(cHashMap);//{Sam=90, Ram=90}
		
		cHashMap.replace("Sam", 90, 75);
		System.out.println(cHashMap);//{Sam=75, Ram=90}
	}

}
