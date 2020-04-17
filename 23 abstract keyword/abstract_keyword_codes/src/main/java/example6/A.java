// this code will not compile
// since abstract method ab() is declared in non-abstract class A

package example6;

public abstract class A {
	// this line will give compiletime error
	// because it overrides java.lang.Object.toString() method
	// but signature is mismatching
	// java.lang.Object.toString() has signature `public String toString();`
	// so while overriding `public abstract String toString();` and 
	// `abstract public String toString();` will be valid and code will compile
	abstract String toString();
}