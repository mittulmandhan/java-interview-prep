package playingwithobjects;

// using method to assign object reference to a reference variable
public class B4 {
	int x=10;
	
	B4 ab() {
		System.out.println("In ab()");
		// this returning object reference will be stored in b
		return new B4();// return 102
	}
	
	public static void main(String[] args) {
		B4 a=new B4();// a=101
		// b will store the object reference returned by ab() method
		B4 b=a.ab();// b=101.ab() or b=102
		
		System.out.println(a.x);// 101.x or 10
		System.out.println(b.x);// 102.x or 10
	}
}
