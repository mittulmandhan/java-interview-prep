package prevent_finally_execution;

// Here we will prevent finally from executing
// using exit function
public class A {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		} finally {
			System.out.println("finally block is always executed");
		}
	}
}
