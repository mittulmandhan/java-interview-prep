// this program will not compile
// because we are trying to assign values to the final variable, i.e. x, more than once

package final_variable.example1;

public class A {
	public static void main(String args[]) {
	    final int x=10;
	    x=20;
	    x=30;
	    System.out.println(x);
	  }
}
