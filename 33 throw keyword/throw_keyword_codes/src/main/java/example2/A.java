package example2;

public class A {
	void divide(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("b is zero");
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		new A().divide(10, 2);
		new A().divide(10, 0);
		throw new ArithmeticException("cannot divide by zero");
	}
}
