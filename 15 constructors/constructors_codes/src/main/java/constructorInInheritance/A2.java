package constructorInInheritance;

// program will not compile
// compiler only calls no-argument constructor of superclass
// compiler will see there is no non-parameterized constructor in B2
// and there is no user defined constructor in class A2
// compiler will ask to make explicit/user-defined constructor and invoke B's parameterized constructor
// compiler message: 'Implicit super constructor B2() is undefined for default constructor. Must define an explicit constructor'
public class A2 extends B2 {
	
//	What compiler will try to add?
//	A2() {
//		// this invocation of super class' constructor will not work
//		// since super class is not having any non-parameterized constructor
//		super();
//	}
	
//	Adding following piece of code will make this program work
//	A2() {
		// correct parameterized constructor invoked
//		super(6);
//	}
	
	public static void main(String[] args) {
		// A2's constructor invoked
		new A2();
	}
}

class B2 {
	B2(int x) {
		System.out.println("B");
	}
}
