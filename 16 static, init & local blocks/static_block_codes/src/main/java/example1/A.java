package example1;

public class A {
	// static block will be executed first
	static {
		System.out.println("in private block");
	}
	
	// and then main method will be executed
	public static void main(String[] args) {
		System.out.println("in main method");
	}
}
