package example6;

// Here class A will be loaded first of all
// then A's static block will be executed
// then main method will be called
// then A's default constructor will be executed
// then class B will be loaded
// then B's static block will be executed
// then B's constructor will be executed
// and finally instance variable of class B(i.e x) will be printed
// as given @line:18
public class A {
	static {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		System.out.println(new B().x);
	}
}
