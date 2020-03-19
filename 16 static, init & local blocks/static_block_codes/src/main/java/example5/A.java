package example5;

// In case of inheritance parent class' static block is called first then current class'
public class A extends B{
	static {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
	}
}

class B {
	static {
		System.out.println("B");
	}
}
