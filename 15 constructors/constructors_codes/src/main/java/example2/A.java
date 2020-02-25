package example2;

public class A {
	// '=10' is called instance variable initializer and it executed before constructor
	int x=10;// 'int x;' is the correct way to define a variable
	
	// constructor is executed after initializers
	A() {
		x=60;// this.x=60 i.e. 101.x=60
	}
	
	public static void main(String[] args) {
		A a=new A();// a=101
		System.out.println(a.x);// 101.x i.e. 60
	}
}
