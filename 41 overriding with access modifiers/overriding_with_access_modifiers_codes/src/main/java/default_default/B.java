package default_default;

public class B extends A {

	// default is as restrictive as default
	// so this code is fine
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
