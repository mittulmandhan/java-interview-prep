package errors;

// In this() and super(), we cannot call instance members
public class A2 {
	int x=10;
	
	A2() {
		// here compiler will show error as object has not done its job yet.
		super(x);
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		new A2();
	}
}

class B2 {
	B2(int x) {
		System.out.println(x);
	}
}
