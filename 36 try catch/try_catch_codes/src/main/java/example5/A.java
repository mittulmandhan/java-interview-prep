package example5;

// Here, An exception is occuring inside catch block
// we can handle it using a nested try-catch block inside catch
// Which is done in A1 class
public class A {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("catch block");
			System.out.println(10 / 0);
		}

		System.out.println("end of main");
	}
}
