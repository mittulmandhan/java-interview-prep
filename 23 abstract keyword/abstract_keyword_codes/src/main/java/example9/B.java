// now that B is inheriting A
// so child B has to override all the abstract methods of abstract super class A
// here B will give body or implementation of ab() method

package example9;

public class B extends A {
	void ab() {
		System.out.println("ab()");
	}

	public static void main(String[] args) {
		new B().ab();
	}
}