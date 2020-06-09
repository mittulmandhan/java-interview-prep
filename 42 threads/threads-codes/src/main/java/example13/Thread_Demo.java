package example13;

public class Thread_Demo implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// This thread will do nothing since we have not passed any Runnable
		// object in it
		// This thread is blank i.e. it will not invoke run() method
		Thread t = new Thread(new Thread_Demo());
		t.setPriority(10);
		System.out.println(t.getPriority());
		t.start();

	}
}