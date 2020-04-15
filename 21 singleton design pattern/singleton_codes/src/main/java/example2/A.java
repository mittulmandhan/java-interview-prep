package example2;

public class A {
	
	public static void main(String[] args) {
		Square square = Square.getInstance();
		square.x=5;
		
		// before calling ab() method of class B
		System.out.println("before calling ab() method of class B");
		System.out.println(square.x);// 5
		System.out.println(square.getResult());// 25
		
		B b = new B();
		b.ab();
		
		// after calling ab() method of class B
		// you can see in the output changes made by ab() method will be reflected here
		System.out.println("after calling ab() method of class B");
		System.out.println(square.x);// 10
		System.out.println(square.getResult());// 100
	}
}
