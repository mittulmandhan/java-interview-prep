package example3;

public class A {
	static int ab() {
		try {
			System.out.println("A");
			return 10;
		} finally {
			System.out.println("B");
		}
	}

	public static void main(String[] args) {
		System.out.println(ab());
	}
}
