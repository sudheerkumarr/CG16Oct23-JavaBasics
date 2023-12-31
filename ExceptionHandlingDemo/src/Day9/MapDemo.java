package day9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 Map(I) - store values in the form of key value pairs
 
    HashMap(C)
      - Insertion order won't maintain
    LinkedHashMap(C)
      - insertion order will be maintained
    SortedMap(I)
      NavigableMap(I)
        TreeMap(C)
          - store elements in some sorting order
    HashTable - 1.0v 
      - legacy class
      - Thread safe
      
    - duplicate keys won't allowed
    - duplicate values allowed
    - null keys/value depends on implementation classes
    - if key present, value will be overridden
    - if key not present, element will be inserted.
 */
public class MapDemo {

	public static void main(String[] args) {
		// city-pincode/student-marks
		//Map<String, Integer> hm = new HashMap();
		//Map<String, Integer> hm = new LinkedHashMap<>();
		//Map<String, Integer> hm = new TreeMap<>();
		Map<String, Integer> hm = new Hashtable();
		// insert - put
		hm.put("Hyderabad", 100000);
		hm.put("Bengaluru", 560000);
		hm.put("Chennai", 600001);
		hm.put("Hyderabad", 100000);
		
		// Read - get()
		System.out.println(hm.get("Bengaluru"));
		
		// Iterate
		// Convert Map to Set
		Set<Entry<String, Integer>> e= hm.entrySet();
		
		System.out.println();
		Iterator itr= e.iterator();
		
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry)itr.next();
			//System.out.println(itr.next());
			System.out.println(entry.getKey()+" | "+entry.getValue());
		}
			
		System.out.println(hm.size()); // size of map
		System.out.println(hm.keySet()); // return keys
		System.out.println(hm.values()); // return values
		System.out.println(hm.containsKey("Chennai")); //true
		System.out.println(hm.containsValue(100000)); // true
		
		// remove
		System.out.println(hm);
		hm.remove("Chennai");
		System.out.println(hm);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
