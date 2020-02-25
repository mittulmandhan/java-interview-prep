package constructorInInheritance;

public class A extends B {
	A() {
		// code to be added by compiler which will call B class' constructor
		// super();
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		new A();
	}
}

class B {
	B() {
		System.out.println("B");
	}
}
