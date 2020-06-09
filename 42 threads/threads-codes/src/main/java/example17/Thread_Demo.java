package example17;

public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Thread_Demo a = new Thread_Demo();
		Thread t1 = new Thread(a, "t1");
		Thread t2 = new Thread(a, "t2");

		t1.start();
		t2.start();
	}

}
