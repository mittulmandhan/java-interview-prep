package example3;

// In this case, NullPointerException will be handled by JVM
// We haven't handled the exception using try-catch or throws
// We will handle this error using try-catch in A1 class
public class A {
	public static void main(String[] args) {
		throw new NullPointerException();
	}
}
