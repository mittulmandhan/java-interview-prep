package try_with_resources;

public class A {
	public static void main(String[] args) {
		try (Resource r = new Resource();) {
			System.out.println(r.divide(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("2nd argument should not be zero");
		}
	}
}
