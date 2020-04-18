package example2;

class B {
	public static void main(String[] args) {
		// compiler will not give error here
		// because we are not instantiating interface A
		// we are just creating a reference variable of type A
		A a = null;
	}
}