package example4;

public class A {
	int x=10;
	
	{
		// instantiation of object of class A in init block will lead to stackoverflow error
		System.out.println(new A().x);
	}
	
	public static void main(String[] args) {
		new A();
	}
}
