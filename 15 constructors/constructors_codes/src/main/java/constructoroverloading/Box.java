package constructoroverloading;

// This is an example showing a realistic use of constructor overloading
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
	    width=height=depth=dimensions;
	  }
	  
	  // constructor to be used when no dimensions are specified
	  Box() {
	    width=height=depth=0;
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
