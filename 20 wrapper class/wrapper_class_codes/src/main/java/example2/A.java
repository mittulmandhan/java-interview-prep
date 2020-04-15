// default value of a wrapper class object will always be null since it is an object.

package example2;

public class A {
	int x;
	Integer m;

	public static void main(String args[]) {
		A a = new A();
		System.out.println(a.x);// 0
		System.out.println(a.m);// null
	}
}