package playingwithobjects;

public class A4 {
	int x=10;
	
	public static void main(String[] args) {
		A4 a=new A4();// a=101
		a.x=60;// 101.x=60
		A4 b=new A4();// b=102
		// assigning value of one object's instance variable to another object's instance variable
		b.x=a.x;// 102.x=101.x or 102.x=60
		System.out.println(a.x);// 60
		System.out.println(b.x);// 60
	}

}
