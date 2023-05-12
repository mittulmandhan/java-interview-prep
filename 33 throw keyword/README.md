# `throw` Keyword
* `throw` is a keyword.
* throw keyword is used to generate an exception manually.
* It is a way to explicitly throw an exception.
* We can throw either checked or unchecked exception in java by using throw keyword.
* The throw statement requires a single argument i.e. a throwable object.
* Throwable objects are the objects of any subclass of the Throwable class such as ClassNotFoundException, SecurityException, ArithmeticException, ArrayIndexOutOfBoundException, InterruptedException, ExceptionInInitializerError, etc.
* Syntax:<br>
  `throw someThrowableObject;`
* Throwing(using thow keyword) an object of Object class is not valid because Object class is not a subclass of Throwable class.
* Compiler checks syntax, compile time exceptions and then compiles the code. Hence, if we throw compile time exceptions program will not comile but if we throw an error or runtime exception it will compile successfully and will show error at runtime.
````
public class A {
	public static void main(String[] args) {
		// NullPointerException is a runtime exception
		// so this line of code will compile
		throw new NullPointerException();

		// due to this line, program will not compile
		// and compiler will show a message that this exception
		// must be handled by try/catch or throws
		throw new Exception();
	}
}
````
__output:__
````
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable code

	at example1.A.main(A.java:12)
````
* We can create a custom exception and throw it using throw keyword as well. This is the most common purpose of using throw keyword.
````
public class A {
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
````
````
// my custom exception
public class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
}
````
__output:__
````
example3.MyException
````
### More Examples
__1.__ 
````
public class A {
	void divide(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("b is zero");
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		new A().divide(10, 2);
		new A().divide(10, 0);
		throw new ArithmeticException("cannot divide by zero");
	}
}
````
__output:__
````
5
Exception in thread "main" java.lang.ArithmeticException: b is zero
	at example2.A.divide(A.java:6)
	at example2.A.main(A.java:12)
````

__2.__ 
````
public class A {
	void canIVote(int age) {
		if (age < 18) {
			throw new ArithmeticException("No, your age is less than 18");
		} else {
			System.out.println("Yes, you can vote!");
		}
	}

	public static void main(String[] args) {
		new A().canIVote(20);
		new A().canIVote(15);
	}
}
````
__output:__
````
Yes, you can vote!
Exception in thread "main" java.lang.ArithmeticException: No, your age is less than 18
	at example4.A.canIVote(A.java:6)
	at example4.A.main(A.java:14)
````

<br><br>__Resources:__
* https://www.javatpoint.com/throw-keyword
* https://www.w3schools.com/java/ref_keyword_throw.asp
* https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html
