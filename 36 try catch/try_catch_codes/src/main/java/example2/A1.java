package example2;

// This is an variation of class A
// which shows the flow of the program
// when exception does not occur
public class A1 {
	public static void main(String[] args) {
		int a = 10, b = 10;

		try {
			// risky code
			// It throws an object of ArithmeticException class
			// when an b=0
			// In such case catch block is called immediately
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
