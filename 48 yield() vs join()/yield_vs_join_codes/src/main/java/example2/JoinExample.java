package example2;

public class JoinExample implements Runnable{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello "+Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new JoinExample(), "t1");
		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello "+Thread.currentThread().getName()+" "+i);
		}
	}
	
}
