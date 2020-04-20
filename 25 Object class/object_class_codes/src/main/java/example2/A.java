package example2;

public class A {
	static int count = 1;
	int id;

	A() {
		id = count;
		count++;
	}

	@Override
	public String toString() {
		return "id of this object is " + id;
	}

	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();

		System.out.println(obj1.toString());
		System.out.println(obj2);
	}
}
