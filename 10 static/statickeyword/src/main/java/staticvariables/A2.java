package staticvariables;

// This program shows that a single copy of static variable is shared among all the objects
// Here count will count how many objects have been created so far
public class A2 {
	static int count;
	
	A2() {
		// each & every time you create an object of type A2 constructor will increment count by 1
		count++;
	}
	
	public static void main(String[] args) {
		System.out.println(count);
		new A2();
		System.out.println(count);
		new A2();
		System.out.println(count);
		new A2();
		System.out.println(count);
	}
}
