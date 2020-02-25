package errors;

// this error will occur when we want to invoke a constructor that does not exist
public class A {
	A(int x) {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		new A(6);
		// As we already have one user defined constructor
		// constructor will not create a default constructor 
		// thus following statement will give compile time error
		// compiler message: 'The constructor A() is undefined'
		new A();
	}
}
