package example2;

public class A {
	
	// first of all, this static block will be executed
	static {
		System.out.println("in static");
	}
	
	// atlast, main method will be executed
	public static void main(String[] args) {
		System.out.println("in main");
	}
	
	// this static block will be executed in after first static block but before main
	static {
		System.out.println("in static 2");
	}
}
