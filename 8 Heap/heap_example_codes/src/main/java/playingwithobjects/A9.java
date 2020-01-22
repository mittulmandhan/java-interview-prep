package playingwithobjects;

// here a & obj are reference to same object so changes made by one will reflect in both
public class A9 {
	int x=10;
	
	void ab(A9 a /* a=101 */) {
		System.out.println("In ab(): "+a.x);// 10
		a.x=50;//101.x=50
	}
	
	public static void main(String[] args) {
		A9 obj=new A9();// obj=101
		System.out.println("before calling ab(): "+obj.x);// 10
		obj.ab(obj);// 101.ab(101)
		System.out.println("after calling ab(): "+obj.x);// 50
	}
}
