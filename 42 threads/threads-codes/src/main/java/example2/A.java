package example2;

public class A implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(new A());
		t.start();
		for (int i = 0; i < 100000; i++) {
			System.out.println("hello1=================="+i);
		}
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("hello2++++++++++++++++++"+i);
			// Thread.sleep(1000);
		}
	}
}
