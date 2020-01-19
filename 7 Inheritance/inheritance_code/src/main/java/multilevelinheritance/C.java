package multilevelinheritance;
import multilevelinheritance.B;

// class C is extending B and further B extends A
// so now A's & B's members can be accessed using C's object
public class C extends B {
	int z=30;
	
	void fun() {
		System.out.println("class A's data member x = "+this.x);
		System.out.println("class B's data member y = "+this.y);
		System.out.println("this class' data member z = "+this.z);
	}
	
	public static void main(String[] args) {
		new C().fun();
	}
}
