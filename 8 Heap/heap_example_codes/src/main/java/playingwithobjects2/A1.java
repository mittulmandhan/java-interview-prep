package playingwithobjects2;

// In this example also, we are initializing a reference variable using a method i.e. called by another object reference
public class A1 {
	int x=10;
	
	A1 ab() {
		A1 a=new A1();// a=102
		a.x=60;// 102.x=60
		return a;// return 102
	}
	
	public static void main(String[] args) {
		A1 a=new A1();// a=101
		a.x=30;// 101.x=30
		A1 c=a.ab();// c=101.ab() i.e. c=102
		System.out.println(a.x);// 101.x i.e. 30
		System.out.println(c.x);// 102.x i.e. 60
	}
}
