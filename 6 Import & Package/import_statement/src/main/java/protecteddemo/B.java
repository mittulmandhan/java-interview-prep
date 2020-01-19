package protecteddemo;
//import works
import protecteddemo.A;

//accessing public A's protected members within package
public class B {
	public void my() {
		System.out.println(new A().x);
	}

	public static void main(String[] args) {
		System.out.println(new A().x);
	}

}
