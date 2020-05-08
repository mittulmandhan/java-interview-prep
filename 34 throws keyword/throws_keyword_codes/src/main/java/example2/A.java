package example2;

public class A {
	void ab() throws Exception {
		// If I comment this line then output will be 'in ab()'
		throw new Exception();

		// this is unreachable code
		System.out.println("in ab()");
	}

	void abc() throws Exception {
		ab();
	}

	void abcd() throws Exception {
		abc();
	}

	// here main() can handle the exception by using try/catch
	// or it can pass the exception to JVM by using throws keyword
	// then JVM will have to handle the exception generated
	// & JVM always prints name of Exception class
	//
	public static void main(String[] args) throws Exception {
		new A().abcd();
	}
}
