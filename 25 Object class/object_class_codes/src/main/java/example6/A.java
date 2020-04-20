package example6;

// program to demonstrate working of finalize()
public class A {

	// this method will be called by garbage collector
	@Override
	protected void finalize() {
		System.out.println("finalize() method called");
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.hashCode());

		a = null;

		// calling garbage collector
		System.gc();

		System.out.println("end");
	}
}
