package example4;

// static block is generally used to initialize static variables
public class A {
	static int a;
	
	static {
		a=10;
	}
	
	public static void main(String[] args) {
		System.out.println(A.a);
	}
}