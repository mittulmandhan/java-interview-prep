package constructorcallingconstructor;

// constructor chaining using this()
public class B {
	B() {
		this('a');
		System.out.println("A");// print 'A'
	}
	B(int x) {
		System.out.println("B");// print 'B'
	}
	B(char c) {
		this(6);
		System.out.println("C");// print 'C'
	}
	
	public static void main(String[] args) {
		new B();
	}
}
