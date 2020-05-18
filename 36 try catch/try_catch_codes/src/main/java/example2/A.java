package example2;

// Now we are going handle the error occured in example1
// To handle the error we will use try-catch block
public class A {
	public static void main(String[] args) {
		int a = 10, b = 0;

		try {
			// risky code
			// throws an object of arithmetic error
			System.out.println(a / b);

			// This statement will execute when exception does not occur
			// but when an error occurs this statement does not executes
			System.out.println("in try");
		} catch (ArithmeticException e) {
			// exception handling
			System.out.println("in catch block");
		}

		// Execution of this statement represents that
		// normal flow of the program is not interrupted
		// by the exception
		System.out.println("flow is normal");
	}
}
