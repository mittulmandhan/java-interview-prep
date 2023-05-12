# Exceptions
* An exception is an unexpected event that disrupts the normal flow of the program.
* Following are some scenarios where an exception occurs:
  - User has entered an invalid data
  - A file that needs to be opened cannot be found
  - A network connection has been lost in the middle of communication
  - JVM has ran out of memory
* There are 3 categories of exceptions:
  - Compile Time Exception or Checked Exceptions
  - Unchecked Exceptions
    - Runtime Exceptions
    - Errors
* Compile-time exceptions are handled by programmer whereas runtime exceptions are handled by JVM.
* Exceptions are handled by using:
  - try catch block
  - throws keyword
### Compile-time Exceptions/Checked Exceptions
* A checked exception is an exception that is checked by the compiler at compile-time.
* These are the problems which can be known at compile-time or code writing.
* If we want to make a new compile time exception then we can do so by making a new class which inherits Exception class.
* Such exceptions are to be handled by the programmer at compile-time otherwise program won't compile.
* For example:
````
public class A {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E://file.txt");
		FileReader fr= new FileReader(file);
	}
}
````
__output:__
````
Exception in thread "main" java.io.FileNotFoundException: E:\file.txt (The system cannot find the path specified)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at java.io.FileReader.<init>(Unknown Source)
	at example1.A.main(A.java:10)
````
### Runtime Exceptions/Unchecked Exception
* Unchecked exception is an exception that occurs at the time of execution.
* These are the problems which can be known at runtime or execution.
* These include programming bugs, such as logical/arithmetical errors or improper use of an API.
* Runtime exceptions are ignored at compilation time.
* If we want to make a new runtime exception then we can do so by making a new class which inherits RuntimeException class.
* The code which can cause problem at runtime is called Risky Code.
* Example 1:
````
public class A {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println();
		System.out.println(10 / 0);// Risky Code
		System.out.println("end");
	}
}
````
__output:__
````
Hello

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at example2.A.main(A.java:7)
````
* Example 2:
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 12, 26, 13, 43 };
		System.out.println(arr[5]);
	}
}
````
__output:__
````
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at example3.A.main(A.java:6)
````
### Errors
* These are not actually exceptions, but problems that arise beyond the control of the user.
* All errors fall into unchecked exception's category.
* Errors are usually ignored in your code because you can not do anything about an error.
* __For example:__
  - StackOverflowError.
  - If hardware crashes, we cannot remove this problem.
  - NoSuchMethodError can not be handled or removed.
* If we want to make a new error then we can do so by making a new class which inherits Error class.
* Suppose we have a program which requires a minimum memory of 256mb RAM but our program has only 128mb RAM.In this case, our Program will not run and gives OutOfMemoryError.
## Exception Hierarchy
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/Exceptions/Exception%20Hierarchy.jpeg)
* RuntimeException & its child classes and Error and its child classes are unchecked exceptions.
* All other exceptions are checked exceptions.
### java.lang.Throwable
* java.lang.Throwable is the root class for all the errors and exceptions.
* Object class is the superclass of Throwable class.
* It has 2 subclasses i.e. Exception and Error.
* Throwable class is in java.lang package.
* __List of Methods available in the Throwable class:__
1. `public String getMessage()`: Returns a detailed message about the exception that has occured. This message is declared and defined in Throwable class.
````
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
````
__output:__
````
/ by zero
````
2. `public Throwable getCause()`: Returns the cause of the exception as represented by a Throwable object.
````
public class A {
	int x=10;
	public static void main(String[] args) {
		A a=null;
		try {
			System.out.println(a.x);
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}
}
````
__output:__
````
null
````
3. `public String toString()`: Returns the name of the class concatenated with the result of getMessage().
````
public class A {
	int x = 10;

	public static void main(String[] args) {
		A a = null;
		try {
			System.out.println(a.x);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
````
__output:__
````
java.lang.NullPointerException
````
4. `public void printStackTrace()`: Prints the result of toString() along with the stack trace to System.err i.e. the error output stream.
````
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
````
__output:__
````
java.lang.ArithmeticException: / by zero
	at example7.A.main(A.java:6)
````
5. `public StackTraceElement[] getStackTrace()`: Returns an array containing each element on the stack trace. The element at index 0 represents the top of the call stack, and the last element in the array represents the method at the bottom of the call stack.
````
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
````
__output:__
````
java.lang.ArithmeticException: / by zero
	at example7.A.main(A.java:6)
````
6. `public Throwable fillInStackTrace()`: Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.
````
public class A {
	int x = 10;

	public static void main(String[] args) {
		int[] arr = { 10, 6, 34, 17, 20 };
		try {
			System.out.println(arr[7]);
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}
````
__output:__
````
java.lang.ArrayIndexOutOfBoundsException: 7
````
### java.lang.Exception
* java.lang.Exception class is the super class for all types of exceptions.
* Exception class inherits Throwable class.
* Exceptions are recoverable i.e. they can be handled.
* Exception are categorized into checked exception and unchecked exception
* RuntimeException, IOException, SQLException, AWTException, and InterruptedException are the child classes of Exception class.
* Only RuntimeException is an unchecked exception and all the other subclasses of Exception class are checked exception.
* Compile-time exception classes inherits Exception class.
* Runtime exception classes inherits RuntimeException class.
### java.lang.Error
* java.lang.Error is super class for all types of errors.
* It extends java.lang.Throwable class.
* Errors are non-recoverable i.e. they cannot be handled.
* Errors are also unchecked exceptions like runtime exceptions.
* It is out of programming scope because type of error can't be predicted but may be prevented with well planning.
* Examples: VirtualMachineError, AssertionError, OutOfMemoryError, LinkageError, InstantiationError.

<br><br>__Resources:__
* https://www.tutorialspoint.com/java/java_exceptions.htm
* https://www.benchresources.net/exception-hierarchy-in-java/
* https://www.geeksforgeeks.org/exceptions-in-java/
