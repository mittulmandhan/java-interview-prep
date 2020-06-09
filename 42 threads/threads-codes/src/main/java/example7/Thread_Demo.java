package example7;

public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Thread_Demo());
		t.start();
		// calling start method again will give IllegalThreadStateException
		t.start();
	}

}
