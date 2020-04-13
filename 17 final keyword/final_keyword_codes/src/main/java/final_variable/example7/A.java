// in ab() method, obj is final
// so the reference in obj cannot be re-initialized
// but the variables of the object, whose reference is stored in obj,
// can be changed and re-initialized unless it is final
// In this case x is not final so we can change the value in it

package final_variable.example7;

public class A {
	int x=10;
	void ab(final A obj) {
		System.out.println(obj.x);
		obj.x=50;
		System.out.println(obj.x);
	}
	public static void main(String[] args) {
		new A().ab(new A());
	}
}
