package playingwithobjects;

// compile time error due to non initialized reference variable b
public class B5 {
	int x=10;
	
	B5 ab(B5 b /*b=103*/, C c /*c=101*/) {
		b.x=c.y;// 103.x=101.c or 103.x=60
		b=new B5();// b=104
		return b;// return 104
	}
	
	public static void main(String[] args) {
		C c=new C();// c=101
		c.y=60;// 101.y=60
		
		// b=102
		//102.ab(103,101)
		B5 b=new B5().ab(new B5(),c);// b=104
		System.out.println(b.x);// 10
		System.out.println(c.y);// 60
	}
}

class C {
	int y=20;
}
