package example1;

// This code shows what happens 
// when an exception occurs
// but we dont handle it.
public class A {
	public static void main(String[] args) {
		int a = 10, b = 0;

		// This is a risky code
		// It will throw an arithmetic exception
		// at the runtime
		System.out.println(a / b);

		// Execution of this statement represents that
		// normal flow of the program is not interrupted
		// by the exception
		System.out.println("message");
	}
}
