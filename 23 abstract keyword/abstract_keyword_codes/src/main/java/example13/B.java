// class B have overridden ab() of class A
// Now(at run-time), only one ab() method will be present in the method table of class B i.e. class B's ab() method

package example13;

public abstract class B extends A {
	abstract void ab();
}