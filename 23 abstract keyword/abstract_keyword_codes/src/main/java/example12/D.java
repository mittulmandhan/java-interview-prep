// Note:  child class D can also re-override the methods which are overriden in its super class

package example12;

public class D extends C {
	@Override
	void my() {
		System.out.println("my()");
	}

	public static void main(String[] args) {
		A a = new D();
		a.ab();
		a.my();
	}
}