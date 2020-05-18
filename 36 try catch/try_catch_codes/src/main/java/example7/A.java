package example7;

// By making multiple catch blocks
// we are able to give more specific 
// message to an exception
public class A {
	int x = 10;

	public static void main(String[] args) {
		try {
			// ArithmeticException
			// System.out.println(10 / 0);

			// ArrayIndexOutOfBound
			// System.out.println(args[0]);

			// NullPointerException
			A a = null;
			System.out.println(a.x);
		} catch (NullPointerException e) {
			System.out.println("a is null");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong index");
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
	}
}
