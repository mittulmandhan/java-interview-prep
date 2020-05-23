package public_default;

public class B extends A {

	// default is more restrictive than public
	// so this code will give compile-time error
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
