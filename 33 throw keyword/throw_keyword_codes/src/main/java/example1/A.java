package example1;

public class A {
	public static void main(String[] args) {
		// NullPointerException is a runtime exception
		// so this line of code will compile
		throw new NullPointerException();

		// due to this line program will not compile
		// compiler will show a message that this exception
		// exception must be handled by try/catch or throws
		throw new Exception();
	}
}
