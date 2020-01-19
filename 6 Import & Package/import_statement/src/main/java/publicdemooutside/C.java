package publicdemooutside;
//import works
import publicdemo.A;

//accessing class A's public members outside package
public class C {
	int y=20;
	
	public static void main(String[] args) {
		A a = new A();
		C c = new C();
		
		System.out.println(a.x);
		System.out.println(c.y);
		a.ab();
	}
}
