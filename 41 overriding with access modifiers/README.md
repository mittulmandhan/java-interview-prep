# Method Overriding with Access Modifiers
There is only one rule while doing overriding with Access Modifiers i.e.
>`If you are overriding any method, overriding method(i.e. declared in subclass) must not be more restrictive than the method being overridden(i.e. declared in superclass).`

## Access modifiers in decreasing order of restriction
1. private
2. default
3. protected
4. public

## All Possible Examples
### Method being overridden is private
__Overriding method is private__
````
public class A {
	@SuppressWarnings("unused")
	private void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// private is as restrictive as private
	// so this code is fine
	private void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
__Overriding method is default__
````
public class A {
	@SuppressWarnings("unused")
	private void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// default is less restrictive than private
	// so this code is fine
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
__Overriding method is protected__
````
public class A {
	@SuppressWarnings("unused")
	private void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// protected is less restrictive than private
	// so this code is fine
	protected void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
__Overriding method is public__
````
public class A {
	@SuppressWarnings("unused")
	private void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// public is less restrictive than private
	// so this code is fine
	public void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
### Method being overridden is default
__Overriding method is private__
````
public class A {
	void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// private is more restrictive than default
	// so this code will give compile-time error
	private void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
compile time error
````
__Overriding method is default__
````
public class A {
	void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// default is as restrictive as default
	// so this code is fine
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
__Overriding method is protected__
````
public class A {
	void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// protected is less restrictive than default
	// so this code is fine
	protected void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
__Overriding method is public__
````
public class A {
	void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// public is less restrictive than default
	// so this code is fine
	public void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
### Method being overridden is protected
__Overriding method is private__
````
public class A {
	protected void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// private is more restrictive than protected
	// so this code will give compile-time error
	private void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
compile time error
````
__Overriding method is default__
````
public class A {
	protected void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// default is more restrictive than protected
	// so this code will give compile-time error
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
compile time error
````
__Overriding method is protected__
````
public class A {
	protected void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// protected is as restrictive than protected
	// so this code is fine
	protected void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
__Overriding method is public__
````
public class A {
	protected void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// public is less restrictive than protected
	// so this code is fine
	public void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
### Method being overridden is public
__Overriding method is private__
````
public class A {
	public void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// private is more restrictive than public
	// so this code will give compile-time error
	private void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
compile time error
````
__Overriding method is default__
````
public class A {
	public void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// default is more restrictive than public
	// so this code will give compile-time error
	void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
compile time error
````
__Overriding method is protected__
````
public class A {
	public void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// protected is more restrictive than public
	// so this code will give compile-time error
	protected void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
compile time error
````
__Overriding method is public__
````
public class A {
	public void my() {
		System.out.println("A");
	}
}
````
````
public class B extends A {

	// public is as restrictive as public
	// so this code is fine
	public void my() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B b = new B();
		b.my();
	}

}
````
output:
````
B
````
