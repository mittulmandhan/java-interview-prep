package errors;

// compile time error
public class B {
	int x=10;
	
	public static void main(String[] args) {
		B b;
		// here we are using reference variable b without initializing it
		// so we will encounter a compilation error
		// Error message: The local variable b may not have been initialized
		System.out.println(b.x);
	}
}
