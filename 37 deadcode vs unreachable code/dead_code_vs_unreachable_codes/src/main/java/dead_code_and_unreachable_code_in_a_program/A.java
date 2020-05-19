package dead_code_and_unreachable_code_in_a_program;

// Here dead code and unreachable code
// both exist in a single program
public class A {
	static void ab() {
		System.out.println("how to learn");

		if (true) {
			return;
		} else {
			// this else block is in dead code category
			return;
		}

		// unreachable code
		System.out.println("Java");
	}
}