package multiple_resources;

// Here we are declaring multiple resources in try-with-resources
// when try block ends(normally or abruptly)
// resources will be closed in reverse order in which they are declared
// i.e. r1 will close first and then r will be closed
public class A {
	public static void main(String[] args) {
		try (Resource r = new Resource(); Resource1 r1 = new Resource1();) {
			System.out.println(r.divide(10, 1));
			System.out.println(r1.show(null));
		} catch (ArithmeticException e) {
			System.out.println("Don't pass 0 in 2nd argument of divide() method");
		} catch (NullPointerException e) {
			System.out.println("Don't pass null in show() method");
		}
	}
}
