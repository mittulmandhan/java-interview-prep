package example11;

public class Thread_Demo {
	public static void main(String[] args) {
		// JVM by default sets the name of the main thread as 'main'
		System.out.println(Thread.currentThread().getName());

		// we can also change the name of the current thread
		Thread.currentThread().setName("Mittul");
		System.out.println(Thread.currentThread().getName());
	}
}
