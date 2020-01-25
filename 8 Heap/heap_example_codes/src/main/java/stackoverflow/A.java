package stackoverflow;

// This program will show stack overflow error
public class A {
	// whenever someone creates an object of this class
	// new object is created in heap
	// then that object will create new object too, to initialize its instance level reference variable
	// this process will go on and infinite objects will be created
	// which i turn will give stack overflow error as we get in recursion
	A a = new A();
	int x=10;
	
	public static void main(String[] args) {
		A obj=new A();// a=101
		System.out.println(obj.x);
	}
}
