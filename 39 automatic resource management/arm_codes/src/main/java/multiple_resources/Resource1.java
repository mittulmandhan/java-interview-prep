package multiple_resources;

public class Resource1 implements AutoCloseable {
	int x;

	public Resource1() {
		x = 10;
	}

	public int show(Resource1 r1) {
		return r1.x;
	}

	@Override
	public void close() {
		System.out.println("closing r1");
	}
}
