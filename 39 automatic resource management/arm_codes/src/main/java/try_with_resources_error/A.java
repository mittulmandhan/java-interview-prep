package try_with_resources_error;

public class A {
	public static void main(String[] args) {

		// compile-time error will occur in try()
		// because Resource class does npt implements AutoCloseable interface
		try (Resource r = new Resource();) {
			System.out.println(r.divide(10, 2));
		} catch (Exception e) {
			System.out.println("2nd argument should not be zero");
		}
	}
}
