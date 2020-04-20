package example4;

public class A {
	int x = 10;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A && this.x == ((A) obj).x)
			return true;
		return false;
	}

	void printEquals(Object obj) {
		if (this.equals(obj)) {
			System.out.println("equal");
			return;
		}
		System.out.println("not equal");
	}

	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		B obj4 = new B();
		obj3.x = 20;

		obj1.printEquals(obj2);
		obj1.printEquals(obj3);
		obj1.printEquals(obj4);
	}
}
