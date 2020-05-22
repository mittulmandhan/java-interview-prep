package multiple_resources;

public class Resource implements AutoCloseable {

	public void close() {
		System.out.println("closing r");
	}

	int divide(int a, int b) {
		return a / b;
	}

}
