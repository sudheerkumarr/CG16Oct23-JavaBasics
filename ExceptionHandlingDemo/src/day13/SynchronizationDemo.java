package day13;

class Counter {
	int count; // 0, num=5

	synchronized void incr(int num) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(count += num); // 5, 10, 15, 20, 25
		}
	}
}

class MyThread5 extends Thread {
	Counter c;

	MyThread5(Counter c) {
		this.c = c;
	}

	public void run() {
		c.incr(5);
	}
}

class MyThread10 extends Thread {
	Counter c;

	MyThread10(Counter c) {
		this.c = c;
	}

	public void run() {
		c.incr(10);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {

		Counter c = new Counter();

		MyThread5 t1 = new MyThread5(c);
		MyThread10 t2 = new MyThread10(c);

		t1.start();
		t2.start();
	}

}
