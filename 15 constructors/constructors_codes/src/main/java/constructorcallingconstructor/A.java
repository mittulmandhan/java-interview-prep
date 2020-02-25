package constructorcallingconstructor;


// here this() is used within a constructor to invoke another constructor
public class A {
	A() {
		// invoking another constructor
		this(6);
		System.out.println("A");// print 'A'
	}
	A(int x) {
		System.out.println("B");// print 'B'
	}
	
	public static void main(String[] args) {
		new A();
	}
}
