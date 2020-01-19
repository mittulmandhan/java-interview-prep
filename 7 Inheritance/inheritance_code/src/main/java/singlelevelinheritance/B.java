package singlelevelinheritance;
import singlelevelinheritance.A;

// class B is inheriting A and now can access A's members using its own object
public class B extends A {
	int y=20;
	void fun() {
		System.out.println("class A's data member x = "+this.x);
		System.out.println("class B's data member y = "+this.y);
	}

	public static void main(String[] args) {
		B b=new B();
		b.fun();
	}

}
