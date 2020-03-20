package example2;

// In this program the sequence of execution during object creation can be clearly seen
public class A {
	// Here '=10' is instance variable initializer for x
	// this initializer is executed before init block
	int x=10;
	
	// constructors body is executed after init block
	A() {
		System.out.println("in constructor");
	}
	
	// this is init block
	// this is executed just after the instance variable initializers
	{
		System.out.println("init");
		System.out.println(x);// this.x i.e. 10
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		new A();// object creation
	}
}
