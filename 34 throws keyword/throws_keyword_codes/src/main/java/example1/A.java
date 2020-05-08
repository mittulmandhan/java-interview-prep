package example1;

public class A {
	public void divide(int x, int y) {
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println("y is zero");
		}
	}

	public static void main(String[] args) {
		new A().divide(10, 5);
		new A().divide(10, 0);
	}
}
