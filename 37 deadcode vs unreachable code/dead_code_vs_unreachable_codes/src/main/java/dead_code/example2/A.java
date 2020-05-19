package dead_code.example2;

public class A {
	void ab(int a, int b) {
		// dead code since it's calculated but not saved or used anywhere
		a+b;
	}

	public static void main(String[] args) {
		new A().ab(10, 20);
	}
}
