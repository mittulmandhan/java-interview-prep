package example6;

public class B {
	int x=10;
	
	static {
		System.out.println("B");
	}
	B() {
		System.out.println("constructor");
	}
}
