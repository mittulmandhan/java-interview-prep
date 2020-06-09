package example16;

// In this code both of our threads will call yield() method @line: 
// which gets it to runnable state and then thread scheduler again 
// chooses one of the thread to be processed
public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("message" + Thread.currentThread().getName());
		Thread.yield();
		System.out.println("End of run() of " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Thread_Demo b = new Thread_Demo();
		Thread a = new Thread(b, "a");
		Thread c = new Thread(b, "c");
		a.setPriority(Thread.MAX_PRIORITY);
		c.start();
		a.start();
	}

}
