package example3;

// here we created a method having same name as class
// Although it is legal to have a method having same name as constructor
// but it is not advised to do so because it will cause ambiguity/confusion
// among methods and constructors
// compiler will be able able to differentiate between them because method is having a return type
// whereas constructor does not have return a type
public class A {
	int x;
	
	// this is a constructor
	A() {
		System.out.println("I am a constructor");
		this.x=10;
	}
	
	//this is aninstance method
	void A() {
		System.out.println("I am a method having same name as class");
		System.out.println(x);// this.x i.e. 101.x i.e. 10
	}
	
	public static void main(String[] args) {
		// here A class' constructor is called
		A a=new A();// a=101
		System.out.println(a.x);// 101.x i.e. 10
		// here instance method A() is being called
		a.A();// 101.A() 
	}
}
