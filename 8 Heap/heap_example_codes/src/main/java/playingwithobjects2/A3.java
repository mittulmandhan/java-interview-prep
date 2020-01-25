package playingwithobjects2;

public class A3 {
	int x=10;
	
	A3 ab() {
		System.out.println("in ab()");// in ab()
		return new A3();// return 102
	}
	
	public static void main(String[] args) {
		// new A3() will create an object(101) which will call ab method which in turn creates another object(102)
		A3 a=new A3().ab();// a=101.ab() i.e. a=102
		System.out.println(a.x);// 102.x i.e. 10
	}
}
