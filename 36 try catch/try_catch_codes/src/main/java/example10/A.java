package example10;

public class A {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		}
		// here we will encounter a compile time error
		// because Object is out of exception handling
		catch (Object e) {
			System.out.println(e);
		}
	}
}
