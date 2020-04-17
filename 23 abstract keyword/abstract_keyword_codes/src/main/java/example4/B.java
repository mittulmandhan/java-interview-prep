// members of an abstract class can be indirectly called through child class

package example4;

public class B extends A {
	public static void main(String[] args) {
		new B().ab();
	}
}
