package example1;

public class A {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("in catch");
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			System.out.println("in finally");
		}
	}
}
