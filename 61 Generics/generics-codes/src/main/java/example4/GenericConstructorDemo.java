package example4;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		System.out.println(new A<String>("Mittul").getSomething());
		System.out.println(new A<B>(new B()).getSomething());
	}

}

class A<T> {
	private T something;

	// Generic constructor
	public A(T something) {
		this.something = something;
	}

	public T getSomething() {
		return something;
	}

}

class B {
	int x = 10;

	@Override
	public String toString() {
		return "x = " + x;
	}

}
