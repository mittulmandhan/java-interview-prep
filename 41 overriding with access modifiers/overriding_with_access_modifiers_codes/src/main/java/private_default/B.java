package private_default;

public class B extends A {

	// default is less restrictive than private
	// so this code is fine
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
