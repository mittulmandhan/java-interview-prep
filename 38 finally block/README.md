# Finally Block
* Finally block is a block that is used to execute important code such as closing connection, stream, etc.
* It is followed by the try or catch block.
* There can be only one finally block for a try block.
* Finally cannot exist without try block.
* Finally block can exist when there is no catch block.
* Finally block will always be executed no matter what(wether exception occur or not).
* Finally block consists of a code that frees the resources.
* Finally block can contain a try-catch i.e. called inner try-catch.
* Syntax:
````
try {
  // risky code
} catch(ExceptionType e) {
  // handling code
} finally {
  // compulsory code
}
````
or
````
try {
  // risky code
} 
finally {
  // compulsory code
}
````
* Even when you don't handle exception, JVM executes finally block(if any).
````
public class A {
	public static void main(String[] args) {
		try {
			System.out.println("in try block");
			throw new NullPointerException();
		} finally {
			System.out.println("in finally block");
		}
	}
}
````
__output:__
````
in try block
in finally block
Exception in thread "main" java.lang.NullPointerException
	at example7.A.main(A.java:7)
````
* Finally block can be used to put cleanup code such as closing a file, closing a connection etc.
* If try or catch block contains a return statement, just before the execution of that return statement finally block is executed.
````
public class A {
	static int ab() {
		try {
			System.out.println("A");
			return 10;
		} finally {
			System.out.println("B");
		}
	}

	public static void main(String[] args) {
		System.out.println(ab());
	}
}
````
__output:__
````
A
B
10
````
* The only way to prevent finally block to execute, is to either use `System.exit();` statement or by causing a fatal error(which aborts the program) before the execution of finally block.
````
// Here we will prevent finally from executing
// using exit function
public class A {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		} finally {
			System.out.println("finally block is always executed");
		}
	}
}
````
__output:__
````
java.lang.NullPointerException
````

## Finally Block Execution
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/finally%20block/finally%20block%20execution.jpg)
* __Case 1:__  when exception does not occur
````
public class TestFinallyBlock {
	public static void main(String[] args) {
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
````
__output:__
````
5
finally block is always executed
rest of the code...
````
* __Case 2:__ when exception occurs and not handled
````
public class TestFinallyBlock {
	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
````
__output:__
````
finally block is always executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at example5.TestFinallyBlock.main(TestFinallyBlock.java:6)
````
* __Case 3:__ when exception occurs and handled
````
public class TestFinallyBlock {
	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
````
__output:__
````
java.lang.ArithmeticException: / by zero
finally block is always executed
rest of the code...
````

### Examples
__1.__
````
public class A {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("in catch");
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			System.out.println("in finally");
		}
	}
}
````
__output:__
````
in try
in catch
Exception in thread "main" in finally
java.lang.ArrayIndexOutOfBoundsException
	at example1.A.main(A.java:10)
````
__2.__
````
public class A {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			throw new NullPointerException();
		} finally {
			System.out.println("in finally");
		}
		// unreachable code
		System.out.println("end of main");
	}
}
````
__output:__
````
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable code

	at example2.A.main(A.java:12)
````

<br><br>__REsources:__
* https://www.javatpoint.com/finally-block-in-exception-handling
