package throws_plus_overriding.example8;

// Here ab() in class A throws RuntimeException
// but ab() in class B also throws Exception
// This code will give error because
// Exception is not a child class of the RuntimeException
// i.e. the exception thrown in super class definition of the overrided ab() method
public class B extends A {
	@Override
	void ab() throws Exception {
		System.out.println("B");
	}

	public static void main(String[] args) throws Exception {
		new B().ab();
	}
}
