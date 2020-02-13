package proving_this;

// proving that 'this' keyword refers to the current object
public class A {
	  void my() {
		  // this line will print the same reference as obj in main()
		    System.out.println(this);
		  }
		  
		  public static void main(String args[]) {
		    A obj=new A();
		    // this line will print the current object
		    System.out.println(obj);
		    obj.my();
		  }
}
