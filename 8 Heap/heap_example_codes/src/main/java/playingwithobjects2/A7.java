package playingwithobjects2;

public class A7 {
	B7 obj;
	
	public static void main(String[] args) {
		A7 a=new A7();// a=101
		a.obj=new B7();// 101.b=102
		a.obj.obj2=new C7();// 101.102.obj2=103
		
		System.out.println(a.obj.obj2.x);// 101.102.103.x i.e. 10
	}
}

class B7 {
	C7 obj2;
}

class C7 {
	int x=10;
}
