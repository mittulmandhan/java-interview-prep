package example6;

// this program will execute main thread and new Thread independently
// so println statements will printed in random fashion
public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread_Demo.run()");
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Thread_Demo());
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread_Demo.main()");
		}
	}

}
