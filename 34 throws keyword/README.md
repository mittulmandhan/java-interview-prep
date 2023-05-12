# `throws` Keyword
* `throws` is a keyword.
* throws keyword is used to declare an exception.
* Usage of throws keyword ensures normal flow of the program remains intact when an error or exception occurs.
* It informs the programmer that there may occur an error or exception. So, programmer must either throw it further using throws keyword or handle it using try/catch. This practice ensures that normal flow of the program is not hampered when an exception or error occurs.
* It can only be used in signature of method.
* throws keyword is followed by throwable class name or its sub class name.
* Problem which forced the existance of throws:
````
public class A {
	public void divide(int x, int y) {
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println("y is zero");
		}
	}

	public static void main(String[] args) {
		new A().divide(10, 5);
		new A().divide(10, 0);
	}
}
````
__output:__
````
2
y is zero
````
* Only checked exception should be declared using throws because
  - Unchecked exceptions are under your control so correct your code.
  - Errors are beyond our control.
* __Advantage of throws keyword:__
  - Checked exceptions can be propagated(transmitted in a particular direction) i.e forwarded in call stack.
  - It provides information to the caller of the method about the exception.

### Example
1.
````
public class A {
	void ab() throws Exception {
		// If I comment this line then output will be 'in ab()'
		// throw new Exception();

		// this is unreachable code
		System.out.println("in ab()");
	}

	void abc() throws Exception {
		ab();
	}

	void abcd() throws Exception {
		abc();
	}

	// here main() can handle the exception by using try/catch
	// or it can pass the exception to JVM by using throws keyword
	// then JVM will have to handle the exception generated
	// & JVM always prints name of Exception class
	public static void main(String[] args) throws Exception {
		new A().abcd();
	}
}
````
__output:__
````
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable code

	at example2.A.ab(A.java:9)
	at example2.A.abc(A.java:13)
	at example2.A.abcd(A.java:17)
	at example2.A.main(A.java:26)
````
2. 
````
package exception;

public class InvalidUserException extends Exception {

	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Given User is INVALID";
	};
}
````
````
// when we throw error to jvm and dont handle it
// jvm handles the exception by calling toString() method
public class UserValidation {
	public boolean isValidUser(String name) throws InvalidUserException {
		if (name.equals("")) {
			throw new InvalidUserException();
		}
		return true;
	}

	public static void main(String[] args) throws InvalidUserException {
		System.out.println(new UserValidation().isValidUser(""));
	}
}
````
__output:__
````
Exception in thread "main" Given User is INVALID
	at example3.UserValidation.isValidUser(UserValidation.java:10)
	at example3.UserValidation.main(UserValidation.java:16)
````
3. 
````
package exception;

public class InvalidUserException extends Exception {

	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Given User is INVALID";
	};
}
````
````
// Here we are not using throws statement in main() unlike previous example
// now we need to handle the exception by using try/catch block inside main()
public class UserValidation {
	public boolean isValidUser(String name) throws InvalidUserException {
		if (name.equals("")) {
			throw new InvalidUserException();
		}
		return true;
	}

	public static void main(String[] args) {
		try {
			System.out.println(new UserValidation().isValidUser(""));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("in catch");
		}

	}
}
````
__output:__
````
Given User is INVALID
	at example4.UserValidation.isValidUser(UserValidation.java:10)
	at example4.UserValidation.main(UserValidation.java:17)
in catch
````


<br><br>__Resources:__
* https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws
