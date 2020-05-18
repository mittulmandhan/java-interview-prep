package example3;

public class A1 {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Handled Manually");
		}
	}
}