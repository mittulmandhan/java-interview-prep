package example7;

public class A {
	public static void main(String[] args) {
		try {
			System.out.println("in try block");
			throw new NullPointerException();
		} finally {
			System.out.println("in finally block");
		}
	}
}
