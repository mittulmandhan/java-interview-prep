package example9;

// Getting around the forward reference rule
public class A {
	int x=my();
	int y=10;
	
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	int my() {
		return 8*y;
	}
	
	public static void main(String[] args) {
		new A();
	}
}
