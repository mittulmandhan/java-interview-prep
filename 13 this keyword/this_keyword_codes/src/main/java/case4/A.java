package case4;

// this passed as an argument in the method call
public class A {

	  void call() {
	    System.out.println("In call()");// print "In call()"
	    this.my(this);// 101.my(101)
	  }

	  void my(A a /* a=101 */) {
	    System.out.println("In my()");// print "In my()"
	  }
	  
	  public static void main(String[] args) {
	    A a=new A();// a=101
	    a.call();// 101.call()
	  }
	}
