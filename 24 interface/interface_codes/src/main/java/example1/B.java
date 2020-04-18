package example1;

class B {
	public static void main(String[] args) {
		// this line will not compile
		// because we are trying to instantiate
		// interface A's object
		new A();
	}
}
