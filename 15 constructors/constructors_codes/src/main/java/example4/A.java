package example4;

public class A {
	A() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		// here class B's object is created on heap
		// then class B's constructor is invoked and onject is properly initialized
		// then an object refrence is being returned by new 
		// which is then used access instance member x and print it.
		System.out.println(new B().x);// 101.x i.e. 10
	}
}

class B {
	int x=10;
	
	B() {
		System.out.println("B");
	}
}
