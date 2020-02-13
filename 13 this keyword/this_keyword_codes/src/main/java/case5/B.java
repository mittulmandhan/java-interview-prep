package case5;

// 'this' passed as an argument in constructor call
// It is useful when we want to use an object in multiple classes
public class B {

	  int x=10;

	  B() {
	    A a=new A(this);// new A(101) & a=102 & A's constructor is called for this=102
	  }
	  
	  void display() {
	    System.out.println("Value of x in Class B : " + x);// this.x i.e. 101.x i.e. 10
	  }
	  
	  public static void main(String[] args) {
	    B b=new B();// b=101 and B's constructor is called for this=101
	  }
}

 class A {
	  B obj;
	  
	  // Parameterized constructor with object of B as a parameter
	  A(B obj/* obj=101 */) {
	    this.obj=obj;// 102.obj=101
	    
	    // calling display method of B
	    obj.display();// 101.display()
	  }
}
