package example14;

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
		// this statement will give IllegalArgumentException
		// since 13 does not lie in the limit 1 to 10
		t.setPriority(13);
		System.out.println(t.getPriority());
		t.start();

	}
}