package publicdemo;
//import works
import publicdemo.A;

//accessing public class A's public members within package
public class B {
	public void my() {
		System.out.println(new A().x);
	}

	public static void main(String[] args) {
		System.out.println(new A().x);
		new A().ab();
	}
}
