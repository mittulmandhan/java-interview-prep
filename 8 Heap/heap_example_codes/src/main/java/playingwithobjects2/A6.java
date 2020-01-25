package playingwithobjects2;

public class A6 {
	B6 obj=new B6();// obj=102
	
	public static void main(String[] args) {
		//this single line has create 3 objects
		//this eager approach of loading objects is briefly explained in B7.java inside playingwithobjects package
		System.out.println(new A6().obj.obj2.x);// 103.102.101.x i.e. 103.obj.obj2.x i.e. 10
	}
}

class B6 {
	C6 obj2=new C6();// obj2=101
}

class C6 {
	int x=10;
}