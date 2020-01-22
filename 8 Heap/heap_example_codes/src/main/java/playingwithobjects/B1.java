package playingwithobjects;

public class B1 {
	int x=10;
	
	void ab(B1 a /*a=102*/) {
		System.out.println(a.x);// 102.x is 60
	}
	
	public static void main(String[] args) {
		B1 a=new B1();// a=101
		B1 b=new B1();// b=102
		
		b.x=60;// 102.x=60
		a.ab(b);// 101.ab(102)
		
		System.out.println(a.x);// 10
		System.out.println(b.x);// 60
	}
}
