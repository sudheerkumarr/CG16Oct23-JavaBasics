package day13;

public class Test {

	public static void main(String[] args) {
		// create Thread
		MyThread2 t1 = new MyThread2();
		
		// start thread
		t1.start();
		
		for(int i=0;i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
