package protected_protected;

public class B extends A {

	// protected is as restrictive than protected
	// so this code is fine
	protected void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
