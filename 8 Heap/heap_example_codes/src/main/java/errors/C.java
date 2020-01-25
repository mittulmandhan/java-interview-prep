package errors;

public class C {
	int x=10;
	
	public static void main(String[] args) {
		// here, c is a local variable
		// local variables must be initialize before use
		// you will encounter a compile time error @line:12
		// error message: The local variable c may not have been initialized
		C c;
		System.out.println(c.x);
	}
}
