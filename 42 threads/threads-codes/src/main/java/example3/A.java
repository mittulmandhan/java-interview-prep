package example3;

public class A implements Runnable {
	int i = 0;

	public synchronized void run() {
		for (; i < 10; i++) {
			System.out.println("Hello " + i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		A task = new A();
		Thread t1 = new Thread(task, "t1");
		Thread t2 = new Thread(task, "t2");
		t1.start();
		t2.start();
	}

}
