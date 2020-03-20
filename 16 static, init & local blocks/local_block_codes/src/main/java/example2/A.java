package example2;

public class A {
	  public static void main(String args[]) {
	    int x=10;
	    
	    // local block
	    {
	      int y=20;
	      System.out.println(x);
	      System.out.println(x);
	    }
	    
	    // can't access y as y is declaredinside local block
	    // so cannot be accessed outsidelocal blocks
	    System.out.println(y);
	    
	    System.out.println("end of main");
	  }
}
