package example6;

// Here we used the Exception type catching to handle multiple exceptions
// But it is recommende to use more specific exception classes
// so that all the exceptions are handled differently and appropriately
// In the next code we will use multiple catch blocks to handle multiple exceptions
public class A {
	int x = 10;

	public static void main(String[] args) {
		try {
			// ArrayIndexOutOfBound
			// System.out.println(args[0]);

			// NullPointerException
			A a = null;
			System.out.println(a.x);
		} catch (Exception e) {
			// same message will be shown
			// no matter what exception occurs
			// which is a bad approach
			System.out.println("Exception Handled");
		}
	}
}
