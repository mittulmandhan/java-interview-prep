package valuetransfer;

public class A {
	int x=10;
	
	public static void main(String[] args) {
		A a=new A();// a=101
		B b=new B();// b=201
		
		// value of y(stored in b) assigned to x(stored in a)
		a.x=b.y;// 101.x=201.y or 101.x=30
		System.out.println(a.x);// 30
		System.out.println(b.y);// 30
		
		// this line will only change the value of y stored in b
		b.y=60;// 201.y=60
		System.out.println(a.x);// 30
		System.out.println(b.y);// 60
	}
}
