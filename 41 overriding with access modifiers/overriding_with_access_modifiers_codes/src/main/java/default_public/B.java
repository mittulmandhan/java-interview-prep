package default_public;

public class B extends A {

	// public is less restrictive than default
	// so this code is fine
	public void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
