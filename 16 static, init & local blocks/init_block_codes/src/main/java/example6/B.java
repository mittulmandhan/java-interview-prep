package example6;

//Use of this(), super(), init block & static block
public class B {
	{
		System.out.println("child init");
	}
	
	static {
		System.out.println("child static");
	}
	
	B(int x) {
		this();
		System.out.println("child cons");
	}
	
	B() {
		System.out.println("child cons 2");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		new B();
	}
}
