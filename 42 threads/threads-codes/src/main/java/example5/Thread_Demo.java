package example5;

public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread_Demo.run()");
	}

	public static void main(String[] args) {
		System.out.println("Thread_Demo.main()");
		Thread t = new Thread(new Thread_Demo());
		// It will load the run() method on same stack i.e. main stack
		// t.run();

		// It will make a new stack and load run() method on that stack
		t.start();
	}

}
