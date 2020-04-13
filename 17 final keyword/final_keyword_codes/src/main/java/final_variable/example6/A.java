// here local varialble of ab(), i.e. x, is final
// hence the attempt to increment @line:8 will show compile time error

package final_variable.example6;

public class A {
	void ab(final int x) {
		this.my(++x);
	}
	
	void my(int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new A().ab(6);
	}
}
