package playingwithobjects;

// only one object is created but have two reference variables
// This is an example of a situation where multiple references are referencing towards same object in memory
// If the value of varible is changed through one reference then all references will show that change
public class A6 {
	int x=20;
	
	public static void main(String[] args) {
		A6 a = new A6();// a=101
		a.x=60;// 101.x=60
		System.out.println(a.x);// 60
		
		A6 b=a;// b=101
		b.x=30;// 101.x=30
		
		System.out.println(a.x);// 30
		System.out.println(b.x);// 30
	}
}
