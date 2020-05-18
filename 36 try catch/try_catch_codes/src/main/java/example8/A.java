package example8;

// problem in multiple catch blocks
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (Exception e) {
			System.out.println("A");
		}
		// unreachable code
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("B");
		}
	}
}
