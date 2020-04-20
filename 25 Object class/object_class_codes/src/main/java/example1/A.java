package example1;

public class A {
	public static void main(String[] args) {
		A a = new A();

		// Both of these lines will produce same output
		// because compiler will change
		// a to a.toString()
		System.out.println(a);
		System.out.println(a.toString());
	}
}
