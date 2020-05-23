package protected_default;

public class B extends A {

	// default is more restrictive than protected
	// so this code will give compile-time error
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
