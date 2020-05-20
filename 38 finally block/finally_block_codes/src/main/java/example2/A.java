package example2;

public class A {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			throw new NullPointerException();
		} finally {
			System.out.println("in finally");
		}
		// unreachable code
		System.out.println("end of main");
	}
}
