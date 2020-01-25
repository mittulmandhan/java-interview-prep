package playingwithobjects;

// using object chaining property to initialize reference variables of other classes as well
public class B8 {
	C8 c;// c=null
	
	public static void main(String[] args) {
		// here, unlike previous program(B7), we are are creating 3 objects on 3 different lines
		// this is called lazy approach of loading objects i.e. we will create those particular objects only if we need them 
		// otherwise we will create the object for class in need only
		B8 b=new B8();// b=101
		b.c=new C8();// c=102
		b.c.d=new D8();// d=103
		
		System.out.println(b.c.d.x);// 101.102.103.x i.e. 10
	}
}

class C8 {
	D8 d;// d=null
}

class D8 {
	int x=10;
}
