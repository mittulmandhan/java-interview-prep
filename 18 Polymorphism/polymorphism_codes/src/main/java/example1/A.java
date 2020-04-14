// method overloading example
package example1;

public class A {
	void sum(int x, int y) {
		System.out.println(x + y);
	}

	void sum(long x, long y) {
		System.out.println(x + y);
	}

	void sum(String x, String y) {
		System.out.println(x + y);
	}
}
