package public_protected;

public class B extends A {

	// protected is more restrictive than public
	// so this code will give compile-time error
	protected void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
