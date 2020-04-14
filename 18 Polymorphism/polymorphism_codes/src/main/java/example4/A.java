package example4;

public class A {
	void sum(int x, int y) {
		    System.out.println(x+y);
		  }

	void sum(String x, String y) {
		System.out.println(x + y);
	}

	public static void main(String args[]) {
		A a = new A();
		a.sum(10, 5);// 15
		A b = new A();
		b.sum("foo", "bar");// foobar
	}
}