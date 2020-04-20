package example5;

public class A {
	int x = 10;
	int y = 20;

	public static void main(String[] args) {
		Class<?> c = new A().getClass();

		System.out.println(c.getName());
		System.out.println(c.getCanonicalName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
	}
}
