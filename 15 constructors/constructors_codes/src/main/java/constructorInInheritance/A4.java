package constructorInInheritance;

public class A4 {
	int x=10;
	A4() {
		// superclass'(Object's) constructor invoked
		super();
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		// A4's constructor invoked
		new A4();
	}
}
