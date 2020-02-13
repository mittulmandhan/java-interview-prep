package case1;

// refer to instance variable of current class from inside a method
public class A {
	  int x=10;
	  int y=20;
	  
	  void display(int x, int y /* x=100 & y=200 */) {
		  
		// printing local variables
	    System.out.println("local x = "+x+"\nlocal y = "+y);
	    
	    //printing instance variables
	    System.out.println("instance x = "+this.x+"\ninstance y = "+this.y);
	  }
	  
	  public static void main(String[] args) {
	    A obj=new A();// obj=101
	    obj.display(100, 200);// 101.display(100,200)
	  }
};
