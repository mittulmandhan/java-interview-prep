package example1;

// At first new keyword will create an object in heap.
// then constructor is called as it is on R.H.S.
// It prints "in constructor" then a object reference is assigned to obj
// and finally "end of main" is printed
public class A {
	A() {
		System.out.println("in constructor");
	}
	
	public static void main(String[] args) {
		// constructor is called in this line using new A()
		A obj=new A();
		
		// this coomented line will give a compile time error 
		// as constructor cannot be called using object reference 
		// constructors are called for proper object initialization when space for object is occupied in heap using new keyword
		//obj.A();
		
		System.out.println("end of main");
	}
}
