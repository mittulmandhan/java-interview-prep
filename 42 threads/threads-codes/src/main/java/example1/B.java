package example1;

public class B implements Runnable {

	public static void main(String[] args) {
		// B task = new B();
		Thread a = new Thread(new B(), "A===========================");
		Thread b = new Thread(new B(), "B+++++++++++++++++++++++++++");
		a.start();
		b.start();
	}

	public synchronized void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}
