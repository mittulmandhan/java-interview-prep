// here two method have same set of arguments i.e same no. of arguments and same types of arguments
// changing variable name does not matter since compiler works on data types not on variable names
// hence this code will show compile time error

package example2;

public class A {
	void sum(int x, int y) {
		    System.out.println(x+y);
		  }

	void sum(int y, int x) {
		    System.out.println(x+y);
		  }

	public static void main(String args[]) {
		new A().sum(6, 3);
	}
}
