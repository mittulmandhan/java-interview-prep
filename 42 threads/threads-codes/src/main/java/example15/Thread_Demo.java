package example15;

public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("message " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread_Demo task = new Thread_Demo();
		Thread a = new Thread(task, "a");
		Thread b = new Thread(task, "b");
		// Thread scheduler loads a thread in running state from runnable state
		// according to their priority
		// But that doesn't mean Thread having higher priority will be executed
		// before other Threads
		a.setPriority(Thread.MAX_PRIORITY);
		b.start();
		a.start();
	}

}
