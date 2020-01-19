package defaultdemo;
//import works
import defaultdemo.A;

//accessing public class A's default members within package
public class B {
	public static void main(String[] args) {
		System.out.println(new A().x);
	}
}
