package playingwithobjects;

// passing references in methods as an argument or parameter
public class A8 {
	int x=10;
	
	void ab(A8 obj) {
		// obj=101
		System.out.println(obj.x);// 30
	}
	
	public static void main(String[] args) {
		A8 a=new A8();// a=101
		a.x=30;// 101.x=30
		a.ab(a);// 101.ab(101)
	}
}
