package playingwithobjects;

// accessing instance variables using object reference
public class A1 {
	int x=10;// 101.x=10
	int y=10;// 101.y=20
	
	public static void main(String[] args) {
		A1 a = new A1();// a=101
		System.out.println("x = "+a.x);// print 101.x
		System.out.println("y = "+a.y);// print 101.y
	}
}
