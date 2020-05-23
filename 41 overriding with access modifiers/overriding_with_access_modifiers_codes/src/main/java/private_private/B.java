package private_private;

public class B extends A {

	// private is as restrictive as private
	// so this code is fine
	private void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
