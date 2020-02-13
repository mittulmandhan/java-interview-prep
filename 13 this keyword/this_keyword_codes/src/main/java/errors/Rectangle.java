package errors;

public class Rectangle {
	  int x, y;
	  int width, height;
	  
	  Rectangle() {
	    this(0,0,1,1);
	  }
	  
	  Rectangle(int width,int height) {
		System.out.println(width);
		// compilation error at this line
		// "Unresolved compilation problem: Constructor call must be the first statement in a constructor"
	    this(0,0,width,height);
	  }
	  
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
	    Rectangle rect1=new Rectangle();
	    Rectangle rect2=new Rectangle(10,20);
	    Rectangle rect3=new Rectangle(3,4,10,20);
	    rect1.display();
	    rect2.display();
	    rect3.display();
	  }
	  
	}
