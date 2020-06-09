package example8;

public class Thread_Demo implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Thread_Demo());
		// getName() is used to get the name of the thread
		t.getName();
		t.start();

	}
}
