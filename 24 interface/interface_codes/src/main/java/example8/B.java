package example8;

class B implements A {
	public void ab() {
		System.out.println("in ab()");
	}

	public static void main(String[] args) {
		// this line will give compile time error
		// because we are trying to instantiated interface A
		// A a=new A();

		// this line will compile
		// because we are instantiating class B's object
		// and storing the object reference in a
		// reference variable of type interface A
		A obj = new B();
		obj.ab();
	}
}