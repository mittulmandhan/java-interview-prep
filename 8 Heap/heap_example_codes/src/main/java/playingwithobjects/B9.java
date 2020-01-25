package playingwithobjects;

// In this code, method is used to initialize the reference variable with an object reference
// member method is called using one reference variable to initialize the other reference variable
public class B9 {
	int x=10;
	
	B9 ab() {
		System.out.println("in ab()");// in ab()
		B9 obj=new B9();// obj=102
		return obj;// return 102
	}
	
	public static void main(String[] args) {
		B9 obj1=new B9();// obj1=101
		B9 obj2=obj1.ab();// obj2=101.ab() i.e. obj2=102
		
		System.out.println(obj2.x);// 102.x i.e. 10
	}
}
