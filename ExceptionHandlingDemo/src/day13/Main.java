package day13;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Create Runnable obj
		MyThread myThread = new MyThread();
		MyThread myThread2 = new MyThread();

		// Create Thread using Runnable obj
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread2);
		
		// set thread name
		t1.setName("t1");
		t2.setName("t2");
		
		// priority - 0-10
		// default value - 5
		// set priority
		
	// t1.setPriority(1);
	//	t2.setPriority(10);
		
		
		
		t1.setPriority(Thread.MAX_PRIORITY); // 10
		t2.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);// 5
		
		System.out.println(t1.getPriority()); // 1
		System.out.println(t2.getPriority()); // 10
		System.out.println(Thread.currentThread().getPriority()); //5
		
		
		System.out.println("t1 thread group name:");
		System.out.println(t1.getThreadGroup().getName()); // main
		System.out.println("t2 thread group name:");
		System.out.println(t2.getThreadGroup().getName()); // main
		System.out.println("main thread threadGroup name");
		System.out.println(Thread.currentThread().getThreadGroup().getName());// main
		System.out.println();
		
		// start thread
		t1.start();
		
		t1.join();
		
		System.out.println("####t1 join");
		t2.start();
		

		// isAlive()
		System.out.println("isAlive()");
		System.out.println("main isAlive: " + Thread.currentThread().isAlive());// true
		System.out.println("t1 isAlive: " + t1.isAlive());// false
		System.out.println("t2 isAlive: " + t2.isAlive()); // false
		
		t2.join();
		System.out.println("######t2 join");
		System.out.println("main isAlive: " + Thread.currentThread().isAlive());// true
		System.out.println("t1 isAlive: " + t1.isAlive());// true
		System.out.println("t2 isAlive: " + t2.isAlive()); // true
		for(int i=0;i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("main isAlive: " + Thread.currentThread().isAlive());// true
	;
	}
}
