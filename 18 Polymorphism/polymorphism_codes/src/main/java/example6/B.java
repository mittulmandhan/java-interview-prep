package example6;

public class B extends A {
	void ab() {
		System.out.println("B");
	}

	public static void main(String args[]) {
		A a = new A();
		a.ab();
		B b = new B();
		b.ab();
		A obj = new B();
		obj.ab();
	}
}