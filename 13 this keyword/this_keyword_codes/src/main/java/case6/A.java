package case6;

// We can also return this from a method
// It is useful when we want to get the current instance of the class
public class A {
	  A get() {
		    System.out.println("In get()");// print "In get()"
		    return this;// return 101
		  }
		  
		  void my() {
		    System.out.println("In my()");// print "In my()"
		  }
		  
		  public static void main(String[] args) { 
		    new A().get().my(); // 101.get().my() i.e. 101.my()
		  }
}
