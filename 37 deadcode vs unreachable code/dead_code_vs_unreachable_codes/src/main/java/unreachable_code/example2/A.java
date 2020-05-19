package unreachable_code.example2;

public class A {
	static int ab(int a, int b) {
		int c;

		// after this return statement no code is allowed
		return 10;

		// unreachable since we have already returned
		a = b + c;
	}

	public static void main(String[] args) {
		ab(10, 20);
	}
}
