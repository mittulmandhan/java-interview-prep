package example9;

public class Thread_Demo implements Runnable {
	@Override
	public void run() {
		System.out.println("Running " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread_Demo t = new Thread_Demo();
		Thread a = new Thread(t);
		Thread b = new Thread(t);
		a.start();
		b.start();
	}
}
