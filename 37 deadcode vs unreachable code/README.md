# Dead Code vs Unreachable Code
## Dead Code
* It is executed but redundant piece of code whose results are not used or adds nothing to the rest of the program.
* It does not give error at compile time but it gives warning and when you run the program that piece of code is useless.
* Dead code Wastes CPU performance.
### Examples
* Example 1:
````
// Here, the else block comes into the 
// dead code category
public class A {
	void ab() {
		if (true) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
````
* Example 2:
````
public class A {
	void ab(int a, int b) {
		// dead code since it's calculated but not saved or used anywhere
		a+b;
	}

	public static void main(String[] args) {
		new A().ab(10, 20);
	}
}
````
## Unreachable Code
* Unreachable Code is a piece of code which is simply unreachable regardless of the logic flow of the program.
* It gives error at compile time.
### Examples
* Example 1:
````
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
````
* Example 2:
````
public class A {
	static int ab(int a, int b) {
		int c;

		// after this return statement no code is allowed
		return 10;

		// unreachable since we have already returned
		a = b + c;
	}

	public static void main(String[] args) {
		ab(10, 20);
	}
}
````

## Some more examples
* Example 1:
````
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
````
* Example 2: Identify the dead codes and unreachable codes in the program
````
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
			System.out.println("Hi");
		}else {// dead code
		System.out.println(" java");
  }
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
````


<br><br>__Resources:__
* https://howtodoinjava.com/puzzles/dead-code-and-unreachable-code-in-java-puzzle/
* https://stackoverflow.com/questions/22802698/whats-the-difference-between-dead-code-and-unreachable-code
