package throws_plus_overriding.example5;

// Here ab() in class A throws Exception
// and ab() in class B also throws Exception
//while overriding it is legal to throw the same exception
//which is thrown in the super class definition of the method
public class B extends A {
	@Override
	void ab() throws Exception {
		System.out.println("B");
	}

	public static void main(String[] args) throws Exception {
		new B().ab();
	}
}
