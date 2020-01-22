package playingwithobjects;

public class B2 {
	int x=10;
	
	void ab(B2 a/*a=101*/,B2 b/*b=102*/) {
		System.out.println(a.x);// 20
		System.out.println(b.x);//30
		// change in local variables does not change anything
		// if the value of variables in object is changed by these local variables then only change occurs
		a=b;// a=102
	}
	
	public static void main(String[] args) {
		B2 a=new B2();// a=101
		B2 b=new B2();// b=102
		
		a.x=20;// 101.x=20
		b.x=30;// 102.x=30
		
		a.ab(a, b);// 101.ab(101, 102)
		
		System.out.println(a.x);// 20
		System.out.println(b.x);// 30
	}
}
