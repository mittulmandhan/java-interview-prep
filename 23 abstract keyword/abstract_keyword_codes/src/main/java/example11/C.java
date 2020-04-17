package example11;

public class C extends B {
	// The @Override annotation indicates that the child class method is
	// over-writing its base class method
	// It can improve the readability of the source code
	@Override
	void ab() {
		System.out.println("ab()");
	}

	@Override
	void my() {
		System.out.println("my()");
	}

	public static void main(String[] args) {
		// a can only call ab() method
		A a = new C();
		a.ab();
		// b can call both ab() & my()
		B b = new C();
		b.ab();
		b.my();
	}
}