package example4;

// We will handle the checked exception occuring in this code
// in A1 class
public class A {
	public static void main(String[] args) {
		// This is a compile time error
		// so this code will not compile
		// Which is expected to be handled by programmer
		throw new Exception();
	}
}
