package constructoroverloading;

// In this program we are reusing the code written in the 
// first constructor by using this() statements inside other constructors
public class MyBox {
int width, height, depth;

// construtor to be used when all dimensions are specified
MyBox(int w, int h, int d) {
 width=w;
 height=h;
 depth=d;
}

// constructor to be used when creating cubical box
MyBox(int dimensions) {
 this(dimensions, dimensions, dimensions);
}

// constructor to be used when no dimensions are specified
MyBox() {
 this(0, 0, 0);
}

// compute and return volume
int volume() {
 return width*height*depth;
}

public static void main(String []args) {
 MyBox myBox=new MyBox(10, 20, 30);
 MyBox cube=new MyBox(10);
 MyBox emptyBox=new MyBox();
 
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
