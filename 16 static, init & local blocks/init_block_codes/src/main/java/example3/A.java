package example3;

public class A {
	int x=10;
	
	{
		System.out.println(new B().x);
	}
	
	public static void main(String[] args) {
		new A();
	}
}
