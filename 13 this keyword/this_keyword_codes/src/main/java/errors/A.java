package errors;

// A constructor cannot have multiple this() statement
public class A {
	int x;
	char y;
	
	A() {
		this(0);
		// this line will show a compilation error message
		// "Unresolved compilation problem: Constructor call must be the first statement in a constructor"
		this('A');
	}
	A(int x) {
		this.x=x;
	}
	A(char y) {
		this.y=y;
	}
	void my() {
		int x=100;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.my();
	}
}

