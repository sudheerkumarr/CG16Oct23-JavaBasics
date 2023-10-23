package day11;

/*
 * Below classes provides thread safety in collection
 * Vector  - 1.0 - Legacy classes
 * Hashtable
 * 
 * java.util.Collections class
 * synchronizedSet
 * synchronizedList
 * synchronizedMap
 * 
 * - Only one thread allowed at a time 
 * - poor performance
 * - Inconsistency in output data
 * 
 * Concurrent collections
 * Map(I)
 *   ConcurrentMap(I) 
 *      ConcurrentHashMap(C)
 *      
 * 
 * Collection(I)     
 *   List(I)   
 *     CopyOnWriteArrayList(C)
 *   Set(I)
 *     CopyOnWriteSet(C)
 *     
 *  ConcurrentMap(I) 
 *    Methods
 *     Object putIfAbsent(Object key, Object value) ; 
 *     boolean remove(Object key, Object value) ;
 *     boolean replace(Object key, Object oldValue, Object newValue);
 *     
 *  HashMap m = new Hashmap();   
 *   put(k,v);
 *   m.put(10, "Pooja");
 *   m.put(10, "Shiva");
 *   
 *   sop(m) ;// {10="Pooja"}
 *   
 *   m.remove(10); //{}
 *   m.replace
 *   
 *  
 *  ConcurrentHashMap cm = new ConcurrentHashMap();
 *   cm.putIfAbsent(10, "Pooja");
 *   cm.putIfAbsent(10, "Shiva");
 *   sop(cm); {10="Pooja"};
 *   
 *   
 *  Allows any number of thread to perform  read operations simultaneously.
 *  Write/update operations are limited to 16. 
 *    - Only 16 threads allowed to perform write/update operation simultaneously.
 *  null keys/value are not allowed
 *  thread safe
 *  while one thread iterating map other thread can able to perform update.
 *  We won't get ConcurrentModificationException
 *  
 *  CopyOnWriteArrayList
 *    Thread safety.
 *    Multiple Threads can perform read operations simultaneously
 *    Write/update operations creates clone copy and then write/update operations
 *      performed
 *    insertion order preserved
 *    null & duplicated are allowed
 *    remove operation can't be performed while performing iteration.
 *     ConcurrentModificationException won't occurs
 *     UnsupportedOperationException - occurs while iterating if you try to remove element from 
 *                                     CopyOnWriteArrayList
 *  
 *  Collection(I)
 *    Set(I)
 *      CopyOnWriteArraySet(C)
 *   developed based on CopyOnWriteArrayList
 *   Multiple Threads can perform read operations simultaneously
 *   Write/update operations creates clone copy and then allows to perform write/update operations
 *   insertion order preserved
 *   dupliates not allowed
 *   null - only one
 *   ConcurrentModificationException won't occurs
 *   recommended not to use CopyOnWriteArrayList/CopyOnWriteSet when the 
 *    requirement frequent write/update.
 *  
 */
public class ConcurrentCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
