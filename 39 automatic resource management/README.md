# Automatic Resource Management or Try With Resources
* Try with resources is a new exception handling mechanism introduced in Java 7, which automatically closes the resources used within the try block.
* A resource is an object which is required to be closed once our program is done using it. For example: a file is read, database connection and so on.
* To use the try with resources statement, we simply need to declare the resources within the parenthesis, and the created resource will be automatically closed at the end of the try block
* The close() method is called by JVM at the end of try block regardless of wether try ends normally or abruptly.
* To use class with the try with resources statement we have to make sure that the resource implements Autocloseable interface.
* ARM eliminates the need for the finally block.
* The resources declared in try() gets instantiated just before the execution of try block.
* The resources declared in try() are implicitly declared as final.
* Syntax:
````
try(Resource r = new Resource();...) {
  // use the resource
} catch(ExceptionType e) {
  // exception handling code
}
````
### New way of resource management
````
public class A {
	public static void main(String[] args) {
		try (Resource r = new Resource();) {
			System.out.println(r.divide(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("2nd argument should not be zero");
		}
	}
}
````
````
public class Resource implements AutoCloseable {

	public void close() {
		System.out.println("closing Resource");
	}

	int divide(int a, int b) {
		return a / b;
	}

}
````
__output:__
````
closing Resource
2nd argument should not be zero
````
### Older way of resource management
* when we use any resources like streams, connections, etc. we have to close them explicitly using finally block.
````
public class A {
	public static void main(String[] args) {
		Resource r = new Resource();
		try {
			r.divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("2nd argument should not be zero");
		} finally {
			try {
				r.close();
			} catch (IOError e2) {
				e2.getMessage();
			}
		}
	}
}
````
````
public class Resource implements AutoCloseable {

	public void close() {
		System.out.println("closing Resource");
	}

	int divide(int a, int b) {
		return a / b;
	}

}
````
__output:__
````
2nd argument should not be zero
closing Resource
````
* Here the problem is that close() might lead to unexpected results i.e. why we are using try-catch in finally block.
### Multiple resources in try with resource
* You can declare more than one resources in a try with resources block.
* All of those resources will automatically be closed at the end of the try block.
* In case of multiple resources, the resources will be closed in the reverse order in which they were created inside the parenthesis.
* Note that all the resources in try with resources must implement Autocloseable interface.
````
// Here we are declaring multiple resources in try-with-resources
// when try block ends(normally or abruptly)
// resources will be closed in reverse order in which they are declared
// i.e. r1 will close first and then r will be closed
public class A {
	public static void main(String[] args) {
		try (Resource r = new Resource(); Resource1 r1 = new Resource1();) {
			System.out.println(r.divide(10, 0));
			System.out.println(r1.show(r1));
		} catch (ArithmeticException e) {
			System.out.println("Don't pass 0 in 2nd argument of divide() method");
		} catch (NullPointerException e) {
			System.out.println("Don't pass null in show() method");
		}
	}
}
````
````
public class Resource implements AutoCloseable {

	public void close() {
		System.out.println("closing r");
	}

	int divide(int a, int b) {
		return a / b;
	}

}
````
````
public class Resource1 implements AutoCloseable {
	int x;

	public Resource1() {
		x = 10;
	}

	public int show(Resource1 r1) {
		return r1.x;
	}

	@Override
	public void close() {
		System.out.println("closing r1");
	}
}
````
__output:__
````
10
closing r1
closing r
Don't pass null in show() method
````
### Declaring non-AutoCloseable resources in try-with-resources
* If we declare a resource in try-with-resources and that resource is not a sub-type of AutoClosable interface then we will encounter a compile-time error.
````
public class A {
	public static void main(String[] args) {

		// compile-time error will occur in try()
		// because Resource class does npt implements AutoCloseable interface
		try (Resource r = new Resource();) {
			System.out.println(r.divide(10, 2));
		} catch (Exception e) {
			System.out.println("2nd argument should not be zero");
		}
	}
}
````
````
public class Resource {

	public void close() {
		System.out.println("closing Resource");
	}

	int divide(int a, int b) {
		return a / b;
	}

}
````


<br><br>__Resources:__
* https://www.tutorialspoint.com/Automatic-resource-management-in-Java
* https://www.geeksforgeeks.org/automatic-resource-management-java/
