package example5;

public class A {
	void sum(int x, int y) {
		    System.out.println(x+y);
		  }

	void sum(float x, float y) {
		System.out.println(x + y);
	}

	public static void main(String args[]) {
		A a = new A();
		a.sum(10, 5);// 15
		A b = new A();
		b.sum(10.0f, 20.0f);// 30.0
		// b.sum(10.0, 20.0);
	}
}