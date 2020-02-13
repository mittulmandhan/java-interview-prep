package case3;

// To invoke current class' constructor
// this() is usually used to reuse constructors
public class Rectangle {
	int x, y;
	  int width, height;
	  
	  // constructor with no parameters
	  Rectangle() {
		  // here x,y,width and height are given default value and proceeded for initialization
	    this(0,0,1,1);
	  }
	  
	  // constructor with partial parameters
	  Rectangle(int width,int height) {
		// here x & y given default value whereas width and height is passes to initialize this.width & this.height as input given by user
	    this(0,0,width,height);
	  }
	  
	  // this is the constructor which is initializing all the instance variables
	  Rectangle(int x,int y,int width,int height) {
		
	    this.x=x;
	    this.y=y;
	    this.width=width;
	    this.height=height;
	  }
	  
	  void display() {
	    System.out.println(x+" "+y+" "+width+" "+height);
	  }
	  
	  public static void main(String[] args) {
	    Rectangle rect1=new Rectangle();// calling non-parameterized constructor
	    Rectangle rect2=new Rectangle(10,20);// calling partially parameterized constructor
	    Rectangle rect3=new Rectangle(3,4,10,20);// calling actual initializer constructor with full parameters
	    rect1.display();// 0 0 1 1
	    rect2.display();// 0 0 10 20
	    rect3.display();// 3 4 10 20
	  }
	  
	}
