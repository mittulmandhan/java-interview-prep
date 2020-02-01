package example2;

// In this example, we run class A so it exists in method area
// but class B does not exists in method area
public class A {
	void show() {
		System.out.println("in show()");
	}
	
	public static void main(String[] args) {
		A a=new A();
		// Following line tells the JVM to make object of class B
		// then JVM checks whether class B already exists in method area or not
		// If not, JVM creates a block for class B in method area loads the bytecode B
		// then JVM loads methods of B in method table,
		// then all static variables of B occupies memory and initialized
		// and then an object of B is created in heap
		B b=new B();
		a.show();
		b.ab();
	}
}
