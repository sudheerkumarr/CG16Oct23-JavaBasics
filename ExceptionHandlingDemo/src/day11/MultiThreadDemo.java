package day11;
/*
 *Multitaksing 
 * Multiprocessing -
 *  Working with multiple application at the same time 
 *    ex: notepad, mp3 player
 *  OS Specific
 *  Each process requires its own memory
 *                 
 * Multithreading - 
 *  One application - many independent tasks performing simultaneously
 *  all tasks are independent each other.
 *  ex: Gaming applications, animations, sending web requests to servers, 
 *  advantage - improves performance
 *  memory shared by all threads
 *  inter-thread communication will be faster 
 *    wait(), notify(), notifyAll()
 *    
 *  Thread Life cycle / states:
 *    New - new keyword - When thread is instantiated, then state of the thread is in New state
 *    Runnable - start() - state of thread will be Runnable 
 *    Running - Once thread scheduler allocates resources
 *    blocked/Timed Waiting - wait(), yield(), suspend(), join()
 *        - blocked to runnable state - resume(), notify() & notifyAll()
 *    Dead/Terminate - execution of run() is over. 
 *                   - other threads interrupted current thread execution 
 *                   
 *                   
 * Ways to create threads
 *  2 ways
 *   1. Implementing Runnable interface
 *      step 1: Create class that should implements Runnable interface
 *      step 2: implement void run() 
 *      step 3: Create Thread object using Runnable interface obj.
 *      step 4: call start() method 
 *                    - register thread with thread scheduler
 *                    - calls run() method 
 *                     
 *   2. Extending Thread class (pkg - java.lang)
 *       step 1: Create class that should extends Thread class
 *       step 2: Override run() method of thread class
 *       step 3: Create Thread class object
 *       step 4: call start() method
 */

public class MultiThreadDemo {

	public static void main(String[] args) {
		
		
	}

}
