package identify;

public class IdentifyProblemsInCode {
	public void howToDoInJava_method1() {
		System.out.println("how to learn");
		return;
		// unreachable code
		System.out.println(" java");
	}

	public void howToDoInJava_method2() {
		System.out.println("how to learn");
		if (true) {
			return;
		}
		// dead code
		System.out.println(" java");
	}

	public void howToDoInJava_method3() {
		System.out.println("how to learn");
		while (true) {
			return;
		}
		// unreachable code
		System.out.println(" java");
	}
}
