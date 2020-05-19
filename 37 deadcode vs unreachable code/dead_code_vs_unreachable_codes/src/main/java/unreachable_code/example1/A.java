package unreachable_code.example1;

// code after tthe return keyword
// will never be reached. So, compiler
// gives compile time error as some
// important code after return is never
// going to be executed.
public class A {
	int ab() {
		System.out.println("before return");
		return 10;

		// unreachable code
		System.out.println("after return");
	}

	public static void main(String[] args) {
		System.out.println(new A().ab());
	}
}
