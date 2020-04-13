// this program will not compile
// because we are trying to override final method i.e. ab()

package final_method.example1;

public class A {
	final void ab() {
		System.out.println("A");
	}
}

class B extends A {
	// error will occur here
	void ab() {
		System.out.println("B");
	}
}
