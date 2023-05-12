# Try/Catch Block
* Try/catch block is used to handle runtime exceptions and compile time exception.
* Although it is recommended to use try/catch block only for checked exceptions.
* Errors are not handled using try/catch block since we cannot do anything about an error.
* Syntax:
````
try {
  // Risky Code
} catch(ExceptionType e) {
  // Exception Handling Code
}
````

* Try block is used to enclose the code that might throw an exception i.e. a risky code.
* Try block is used within a method.
* Try block is always followed by catch block and/or finally block otherwise it is non-sensible to use try block.
* Try block is immediately followed by catch block.
* Catch block can't exist without try block.
* But try block can exist without catch block.
* Try block contains the risky code.
* Catch block contains the exception handling code.
* If exception is encountered in try block then catch block is executed.
* One try block can have one or more catch block(s) with itself.
* __Examples:__
1.
````
// This code shows what happens 
// when an exception occurs
// but we dont handle it.
public class A {
	public static void main(String[] args) {
		int a = 10, b = 0;

		// This is a risky code
		// It will throw an arithmetic exception
		// at the runtime
		System.out.println(a / b);

		// Execution of this statement represents that
		// normal flow of the program is not interrupted
		// by the exception
		System.out.println("message");
	}
}
````
__output:__
````
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at example1.A.main(A.java:13)
````
2.
````
// Now we are going handle the error occured in example1
// To handle the error we will use try-catch block
public class A {
	public static void main(String[] args) {
		int a = 10, b = 0;

		try {
			// risky code
			// throws an object of arithmetic error
			System.out.println(a / b);

			// This statement will execute when exception does not occur
			// but when an error occurs this statement does not executes
			System.out.println("in try");
		} catch (ArithmeticException e) {
			// exception handling
			System.out.println("in catch block");
		}

		// Execution of this statement represents that
		// normal flow of the program is not interrupted
		// by the exception
		System.out.println("flow is normal");
	}
}
````
__output:__
````
in catch block
flow is normal
````
3.
````
// This is an variation of class A
// which shows the flow of the program
// when exception does not occur
public class A1 {
	public static void main(String[] args) {
		int a = 10, b = 10;

		try {
			// risky code
			// It throws an object of ArithmeticException class
			// when an b=0
			// In such case catch block is called immediately
			System.out.println(a / b);

			// This statement will execute when exception does not occur
			// but when an error occurs this statement does not executes
			System.out.println("in try");
		} catch (ArithmeticException e) {
			// exception handling
			System.out.println("in catch block");
		}

		// Execution of this statement represents that
		// normal flow of the program is not interrupted
		// by the exception
		System.out.println("flow is normal");
	}
}
````
__output:__
````
1
in try
flow is normal
````
4.
````
// By making multiple catch blocks
// we are able to give more specific 
// message to an exception
public class A {
	int x = 10;

	public static void main(String[] args) {
		try {
			// ArithmeticException
			// System.out.println(10 / 0);

			// ArrayIndexOutOfBound
			// System.out.println(args[0]);

			// NullPointerException
			A a = null;
			System.out.println(a.x);
		} catch (NullPointerException e) {
			System.out.println("a is null");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong index");
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
	}
}
````
__output:__
````
a is null
````
* Catch block takes a Throwable objec5 as an argument i.e. the Throwable or child classes.
* Try/catch block can be nested in try/catch block. This is called inner or nested try/catch block.
````
public class A1 {
	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("catch block");

			// nested try-catch
			try {
				System.out.println(10 / 0);
			} catch (Exception e2) {
				System.out.println("inner catch block");
			}
		}

		System.out.println("end of main");
	}
}
````
__output:__
````
in try
catch block
inner catch block
end of main
````
* If an exception occurs at a particular statement in a try block, the rest of the code within the try block will not be executed. So, it is recommended to write only risky code inside try block.
* We can not give an object of Object class as an argument in catch block since Object is out of exception handling.
````
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		}
		// here we will encounter a compile time error
		// because Object is out of exception handling
		catch (Object e) {
			System.out.println(e);
		}
	}
}
````
__output:__
````
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	No exception of type Object can be thrown; an exception type must be a subclass of Throwable

	at example10.A.main(A.java:10)
````
* __Rules for multiple catch blocks__: We should always declare catch block in a child first hierarchical manner i.e.
  - ArithmeticException, NullPointerException, ClassNotFoundException, etc.
  - RuntimeException, IOException, SQLException, etc.
  - Exception
  - Throwable

<br>__Wrong Approach:__
````
// problem in multiple catch blocks
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (Exception e) {
			System.out.println("A");
		}
		// unreachable code
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("B");
		}
	}
}
````
__output:__
````
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception

	at example8.A.main(A.java:13)
````
<br>__Correct Approach:__
````
// This code shows the correct child first archtecture
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("B");
		}
	}
}
````
__output:__
````
A
````
* When Exception is encountered in inner try block then JVM will search a catch block which supports that exception first in inner catch blocks then after that in outer catch blocks. This design pattern is called __Chain of Responsibility Pattern__.
````
public class A {

	public static void main(String[] args) {
		outerMethod();
	}

	private static void outerMethod() {
		try {
			try {
				int i = 1 / 0;
				A a = null;
				a.toString();
			} catch (ArithmeticException e) {
				// this catch block is called
				// when an arithmetic exception will occur
				System.out.println("inner catch");
			} finally {
				System.out.println("inner finally");
			}
		} catch (NullPointerException e) {
			// this catch block will be called
			// when there is null pointer exception
			System.out.println("outer catch");
		} finally {
			System.out.println("outer finally");
		}
	}
}
````
### Flow in try-catch block
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/try-catch/try-catch%201.jpg)
