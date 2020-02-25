package errors;

// We can not have both this() and super() in a constructor
// we only only have one, this() or super()
// If we try to put both compiler will show error
// There is no way we can counter this
public class A3 {
	A3() {
		super();
		this(6);
		System.out.println("In A3 constructor");
	}
	
	A3(int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new A3();
	}
}
