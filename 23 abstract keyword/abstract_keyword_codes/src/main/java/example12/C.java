// when an abstract method extends another abstract class then chikd class have option
// it can override no abstract method or some abstract methods or all the abstract methods

package example12;

public abstract class C extends B {
	@Override
	void ab() {
		System.out.println("ab()");
	}
}