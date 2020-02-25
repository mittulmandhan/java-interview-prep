package constructorInInheritance;

// this program shows the use of this() and super()
public class A3 extends B3 {
	A3() {
		// superclass'(B3) parameterized constructor invoked
		super(6);
		System.out.println("C");
	}
	
	A3(int x) {
		// A3's non-parameterized constructor invoked
		this();
		System.out.println("D");
	}
	
	public static void main(String[] args) {
		System.out.println("in main()");
		// A3's parameterized constructor invoked
		new A3(6);
	}
}

class B3 {
	B3(int x) {
		// B3's non-parameterized constructor called
		this();
		System.out.println("A");
	}
	
	B3() {
		// Object class' constructor invoked
		System.out.println("B");
	}
}
