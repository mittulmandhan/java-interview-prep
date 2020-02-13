package shadow_concept;

// In this example, name of instance variables of class A 
// and name of local variables of the constructor are same
// So, we are using this keyword to prevent the ambiguity 
// and differentiate between instance variables and local variables
public class A {
	  int x;
	  int y;
	  
	  A(int x, int y) {
		// using this to differentiate b/w instance variables and local variables
	    this.x=x;
	    this.y=y;
	  }
	  
	  void display() {
	    System.out.println("x = "+this.x+"\ny = "+this.y);
	  }
	  
	  public static void main(String[] args) {
	    A obj=new A(10, 20);
	    obj.display();
	  }
};
