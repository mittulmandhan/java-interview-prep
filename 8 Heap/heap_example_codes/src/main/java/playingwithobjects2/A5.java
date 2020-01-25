package playingwithobjects2;

public class A5 {
	int x=10;
	
	A5 ab(A5 a /*a=102*/, B5 b /*b=103*/) {
		a.x=b.y;// 102.x=103.y i.e. 102.x=10
		A5 c=a;// c=102
		
		System.out.println(a.x);// 102.x i.e. 10
		System.out.println(b.y);// 103.y i.e. 10
		System.out.println(c.x);// 102.x i.e. 10
		
		return c;// return 102
	}
	
	public static void main(String[] args) {
		A5 a=new A5().ab(new A5(), new B5());// 101.ab(102, 103) i.e. 102
		// 'new A5().ab(new A5(), new B5());' this entire statement will return 102 object reference of class A5
		System.out.println(a.x);// 102.x i.e. 10
	}
}

class B5 {
	int y=10;
}
