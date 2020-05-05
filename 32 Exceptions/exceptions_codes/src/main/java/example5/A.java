package example5;

public class A {
	int x=10;
	public static void main(String[] args) {
		A a=null;
		try {
			System.out.println(a.x);
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}
}