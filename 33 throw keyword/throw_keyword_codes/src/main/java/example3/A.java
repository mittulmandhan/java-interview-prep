package example3;

public class A {
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
