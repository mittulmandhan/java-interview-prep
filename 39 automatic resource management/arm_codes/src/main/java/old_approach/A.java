package old_approach;

import java.io.IOError;

public class A {
	public static void main(String[] args) {
		Resource r = new Resource();
		try {
			r.divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("2nd argument should not be zero");
		} finally {
			try {
				r.close();
			} catch (IOError e2) {
				e2.getMessage();
			}
		}
	}
}
