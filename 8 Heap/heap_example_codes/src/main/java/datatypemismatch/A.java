package datatypemismatch;

public class A {
	int x=20;
	
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		b.x=30;
		// compile time error due to datatype mismatch between a and b
		// a is of type class A and b is of class B type
		// thus we can not assign b into a and vice versa
		// (error message)Type mismatch: cannot convert from B to A
		a=b;
		System.out.println(a.x);
		System.out.println(b.x);
	}
}
