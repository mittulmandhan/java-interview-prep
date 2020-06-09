package example19;

// Here a is locked only while synchronized is executing
// otherwise t1 & t2 can use a resource
public class Thread_Demo implements Runnable {

	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread_Demo a = new Thread_Demo();
		Thread t1 = new Thread(a, "t1");
		Thread t2 = new Thread(a, "t2");

		t1.start();
		t2.start();
		synchronized (a) {
			a.notify();
		}
	}

}