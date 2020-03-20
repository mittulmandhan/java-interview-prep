package example1;

public class A {
	int x;
	
	{
		x=10;
	}
	
	public static void main(String[] args) {
		System.out.println(new A().x);
	}
	
}
