package multipleinheritance;
import interfaces.*;

// implementing multiple inheritance using interfaces
// interfaces allows us to support multiple inheritance and at the same time prevents diamond problem
// A class can implement more than one inheritance
// Here class C is implementing both interface A & B at the same time
public class C implements A,B {
	int z=30;
	
	void fun() {
		System.out.println("class A's data member x = "+x);
		System.out.println("class B's data member y = "+y);
		System.out.println("this class' data member z = "+this.z);
	}
	
	public static void main(String[] args) {
		new C().fun();
	}
}
