package example2;

public class MathClass {
	synchronized void printNumbers(int n) throws InterruptedException {
		for (int i = 1; i <= n; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			Thread.sleep(500);
		}
	}
}