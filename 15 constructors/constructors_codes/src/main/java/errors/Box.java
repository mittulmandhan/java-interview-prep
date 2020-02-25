package errors;

// In this code Box(int dimensions) constructor is calling itself recursively
// which will ultimately lead to stack overflow
// so compiler shows an error at compile time to prevent uncertainity
// error message: 'Recursive constructor invocation Box(int)'
public class Box {
	  int width, height, depth;
	  
	  // construtor to be used when all dimensions are specified
	  Box(int w, int h, int d) {
	    width=w;
	    height=h;
	    depth=d;
	  }
	  
	  // constructor to be used when creating cubical box
	  Box(int dimensions) {
	    // Here the constructor is calling itself
	    // this statement will lead to a inifinite recursion
	    this(dimensions);
	  }
	  
	  // constructor to be used when no dimensions are specified
	  Box() {
	    this(0, 0, 0);
	  }
	  
	  // compute and return volume
	  int volume() {
	    return width*height*depth;
	  }
	  
	  public static void main(String []args) {
	    Box myBox=new Box(10, 20, 30);
	    Box cube=new Box(10);
	    Box emptyBox=new Box();
	    
	    // volume of the box whose dimensions are specified
	    int vol=myBox.volume();
	    System.out.println(" Volume of my box is " + vol);
	    
	    // volume of the box whose dimensions are specified
	    vol=cube.volume();
	    System.out.println(" Volume of cube is " + vol);
	    
	    // volume of the box whose dimensions are specified
	    vol=emptyBox.volume();
	    System.out.println(" Volume of empty box is " + vol);
	  }
	}
