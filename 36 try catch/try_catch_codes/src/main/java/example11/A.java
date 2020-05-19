package example11;

public class A {

	public static void main(String[] args) {
		outerMethod();
	}

	private static void outerMethod() {
		try {
			try {
				int i = 1 / 0;
				A a = null;
				a.toString();
			} catch (ArithmeticException e) {
				// this catch block is called
				// when an arithmetic exception will occur
				System.out.println("inner catch");
			} finally {
				System.out.println("inner finally");
			}
		} catch (NullPointerException e) {
			// this catch block will be called
			// when there is null pointer exception
			System.out.println("outer catch");
		} finally {
			System.out.println("outer finally");
		}
	}
}
