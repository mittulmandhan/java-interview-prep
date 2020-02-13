package case2;

// To invoke current class' method
public class A {
	
	  void my() {
	  System.out.println("In my()");// print "In my()"
	  this.fun();// 101.fun()
	  }
	  
	  void fun() {
	    System.out.println("In fun()");// print "In fun()"
	  }
	  public static void main(String[] args) {
	    A obj=new A();// obj=101
	    obj.my();// 101.my()
	  }
	};
