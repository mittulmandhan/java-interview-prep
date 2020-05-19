package throws_plus_overriding.example1;

// Here ab() in class A does not declares any exception
// And ab() in class B also does not throw any exception
// this code works perfectly fine
public class B extends A {
	@Override
	void ab() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		new B().ab();
	}
}
