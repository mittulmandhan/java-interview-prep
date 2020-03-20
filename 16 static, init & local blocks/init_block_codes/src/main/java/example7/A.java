package example7;

//Use of this(), super(), init block & static block
public class A {
	static {
		System.out.println("super static");
	}
	
	A() {
		this(6);
		System.out.println("super cons");
	}
	
	{
		System.out.println("super init");
	}
	
	A(int x) {
		System.out.println("super cons 2");
	}
}
