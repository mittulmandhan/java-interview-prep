package constructoroverloading;

public class A {
	// non-parameterized constructor
	A() {
		System.out.println("A");// print 'A'
	}
	
	// parameterized construct
	A(int x) {
		System.out.println("B");// print 'B'
	}
	
	public static void main(String[] args) {
		// invokes non-parameterized constructor
		new A();//output: A
		
		// invokes parameterized construct
		// receiving one integer as an argument
		new A(6);//output: B
	}
}