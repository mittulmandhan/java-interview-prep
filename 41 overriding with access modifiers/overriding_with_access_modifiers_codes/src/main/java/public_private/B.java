package public_private;

public class B extends A {

	// private is more restrictive than public
	// so this code will give compile-time error
	private void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
