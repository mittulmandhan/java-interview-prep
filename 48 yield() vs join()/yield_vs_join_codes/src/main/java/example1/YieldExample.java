package example1;

public class YieldExample implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new YieldExample());
		Thread t2 = new Thread(new YieldExample());
		// this will call run() method
		t1.start();
		t2.start();
		for (int i = 0; i < 3; i++) {
			// Control passes to child thread
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}