package privatedemo;
//import works although we do not need it
import privatedemo.A;

//can not access class A's private members
public class B {
	void my() {
		A a=new A();
		//a.x;// private var is not accesible outside class
		//new A().ab();// private var is not accesible outside class
	}
}
