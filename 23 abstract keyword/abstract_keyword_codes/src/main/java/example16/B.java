package example16;

public class B extends A {
	void ab() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		new B().ab();
	}
}