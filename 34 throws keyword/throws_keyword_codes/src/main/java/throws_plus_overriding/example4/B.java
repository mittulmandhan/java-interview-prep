package throws_plus_overriding.example4;

// Here ab() in class A throws Exception
// but ab() in class B does not throw any exception
//So no error will be shown
//since it is legal to not throw an exception while overriding
//even when the super class' definiton of the method is throwing one
public class B extends A {
	@Override
	void ab() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		new B().ab();
	}
}
