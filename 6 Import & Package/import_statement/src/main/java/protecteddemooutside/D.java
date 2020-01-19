package protecteddemooutside;
//import works
import protecteddemo.A;

//accessing public class A's protected members outside package using inheritance
public class D extends A {

	public static void main(String[] args) {
		System.out.println(new D().x); // x is private
	}
}
