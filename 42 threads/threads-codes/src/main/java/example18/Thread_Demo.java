package example18;

// Here, t1 & t2 but notify() or notifyAll() is never called
// and time is also not specified
//
public class Thread_Demo implements Runnable {

	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.currentThread().wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
