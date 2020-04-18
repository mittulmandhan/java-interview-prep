package example5;

class B /* extends Object */ implements A {
	// class B is passing 3 IS-A Test
	// B IS-A B
	// B IS-A A
	// B IS-A Object
	// So, both of these following lines are valid
	A a = new B();
	Object obj = new B();
}