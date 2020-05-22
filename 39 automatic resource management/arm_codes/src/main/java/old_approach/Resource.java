package old_approach;

public class Resource implements AutoCloseable {

	public void close() {
		System.out.println("closing Resource");
	}

	int divide(int a, int b) {
		return a / b;
	}

}
