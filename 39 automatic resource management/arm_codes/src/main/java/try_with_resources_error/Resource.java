package try_with_resources_error;

public class Resource {

	public void close() {
		System.out.println("closing Resource");
	}

	int divide(int a, int b) {
		return a / b;
	}

}
