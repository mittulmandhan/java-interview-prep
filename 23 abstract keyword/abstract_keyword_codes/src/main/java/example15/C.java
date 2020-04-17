// Here, in method table of class C toString() and toString(int) are overloaded 
// i.e. two separate rows exist for toString() and toString(int) methods(RE-ENTRY in method table)
// Not overridden(REPLACING in method table)
// So, C will have 2 abstract methods to override

package example15;

public class C extends B {
	@Override
	public String toString(int x) {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}
}