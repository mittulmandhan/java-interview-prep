
package playingwithobjects;

// passing values in methods using references
public class A7 {
	int x=10;
	
	void ab(int x) {
		System.out.println(x);// 10
	}
	
	public static void main(String[] args) {
		A7 a =  new A7();// a=101
		a.ab(a.x);// 101.ab(101.x) or 101.ab(10)
	}
}
