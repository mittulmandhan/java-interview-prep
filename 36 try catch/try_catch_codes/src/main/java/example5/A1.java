package example5;

public class A1 {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("catch block");

			// nested try-catch
			try {
				System.out.println(10 / 0);
			} catch (Exception e2) {
				System.out.println("inner catch block");
			}
		}

		System.out.println("end of main");
	}
}