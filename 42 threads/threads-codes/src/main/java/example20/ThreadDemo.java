package example20;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
	}

}
