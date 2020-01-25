package playingwithobjects;

// another example of accessing a variable through object chaining
public class B7 {
	C7 c=new C7();// c=102
	
	public static void main(String[] args) {
		// @line:18, 3 objects are created
		// first the process of creating a new object of class B7 is started @line:18
		// then during the object creation of B7, the process of creating a new object of class C7 is started(@line:5)
		// and then during the object creation of C7, the process of creating a new object of class D7 is started(@line:24)
		// now instance variable x is initialized with a value i.e. 20 and object creation of D7 completes
		// then we come back @line:24 and instance level variable of C7 i.e. reference variable 'd' of type D7 is initialized with an object reference of class D7
		// and object creation process of C7 completes
		// then we come back @line:5 and instance level variable of B7 i.e. reference variable 'c' of type C7 gets initialized with an object reference of class C7
		// and object creation process of B7 completes
		// and finally @line:18 local reference variable in main i.e. 'b' of type B7 gets initialized with an object reference of class B7
		// This approach of creating objects at one is called eager approach of loading objects
		B7 b=new B7();// b=103
		System.out.println(b.c.d.x);// 103.102.101.x i.e. 20
	}
}

class C7 {
	D7 d=new D7();// 101
}

class D7 {
	int x=20;
}