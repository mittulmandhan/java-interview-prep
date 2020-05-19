package throws_plus_overriding.example9;

// Here ab() in class A throws RuntimeException
// and ab() in class B throws RuntimeException
//while overriding it is legal to throw the child exception
//of the exception thrown in the super class definition of the method
//because of the IS-A relationship theory
public class B extends A {
	@Override
	void ab() throws RuntimeException {
		System.out.println("B");
	}

	public static void main(String[] args) throws Exception {
		new B().ab();
	}
}
