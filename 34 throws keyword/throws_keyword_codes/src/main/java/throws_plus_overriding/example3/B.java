package throws_plus_overriding.example3;

// Here ab() in class A does not throws any exception
// but ab() in class B throws RuntimeException
// So this code will not show any error 
// since it is legal to throw unchecked exception
// because it will be handled at runtime by jvm or us
public class B extends A {
	@Override
	void ab() throws RuntimeException {
		System.out.println("B");
	}

	public static void main(String[] args) throws Exception {
		new B().ab();
	}
}
