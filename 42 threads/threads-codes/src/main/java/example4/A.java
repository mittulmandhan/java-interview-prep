package example4;

public class A implements Runnable {

	@Override
	public synchronized void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("RUN " + Thread.currentThread().getName());
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		A t = new A();
		Thread a = new Thread(t, "A");
		Thread b = new Thread(t, "B");

		a.start();
		b.start();
	}

}
