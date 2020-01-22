package playingwithobjects;

// assigning reference of an object from one variable to another
public class A5 {
	int x=20;
	
	public static void main(String[] args) {
		A5 a=new A5();// a=101
		a.x=60;// 101.x=60
		
		A5 b=new A5();// b=102
		a=b;// a=102
		System.out.println(a.x);// 20
		System.out.println(b.x);// 20
		
		a.x=45;// 102.x=45
		System.out.println(a.x);// 45
		System.out.println(b.x);// 45
	}
}
