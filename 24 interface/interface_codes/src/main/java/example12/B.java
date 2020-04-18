package example12;

//There is one toString() method in interface A
//and one toString() method in Object class
//interface A's toString() method overrides the Object class' toString() method
//and interface A's toString() method is overridden by class B's toString() method
class B /* extends Object */ implements A {
	public String toString() {
		return "Hello";
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.toString());
	}
}