package constructorInInheritance;

// here, It is shown that constructors are called in bottom-up order i.e. child to parent
// but object initialization happens in top-down order i.e. parent to child
// the reason behind this order is that super() statement always be at the first line of the constructor
public class A1 extends B1 {
	A1() {
		// will invoke B1 class' constructor
		super();
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		new A1();
	}
}

class B1 {
	B1() {
		// will invoke object class constructor
		super();
		System.out.println("B");
	}
}
