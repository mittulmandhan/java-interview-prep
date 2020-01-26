package stackoverflow;

// This program will show stack overflow error
public class A {
	// whenever someone creates an object of this class
	// new object is created in heap
	// then that object will create new object too, to initialize its instance level reference variable
	// this process will go on and infinite objects will be created
	// calling too many constructors in turn will give us stack overflow error at runtime as we get in recursion
	// In this case too many constructors are loaded on stack and too many objects are created in heap as well
	// but stack will get overflow since stack size is significantly smaller than heap size
	A a = new A();
	int x=10;
	
	public static void main(String[] args) {
		A obj=new A();// a=101
		System.out.println(obj.x);
	}
}
