package example12;

public class Thread_Demo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new TaskOne());
		Thread t2 = new Thread(new TaskTwo());
		t1.start();
		t2.start();
	}
}
