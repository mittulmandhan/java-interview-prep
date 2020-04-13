package final_variable.example4;

public class A {
	final int x;
	
	A() {
		x=20;
	}
	
	public static void main(String[] args) {
		System.out.println(new A().x);
	}
}
