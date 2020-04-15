package example2;

public class B {
	void ab() {
		Square square = Square.getInstance();
		square.x=10;
		
		// Inside ab() method class B
		System.out.println("Inside ab() method class B");
		System.out.println(square.x);// 10
		System.out.println(square.getResult());// 100
	}
}
