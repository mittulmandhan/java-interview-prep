package playingwithobjects2;

// A little complex code using chaining rule 
public class A4 {
	int x=10;
	
	B4 ab() {
		// on first call, a=102
		// on second call, a=105
		A4 a=new A4();
		
		// on first call, 102.x i.e. 10
		// on second call, 105.x i.e. 10
		System.out.println(a.x);
		
		// on first call, return 103
		// on second call, return 106
		return new B4();
	}
	
	public static void main(String[] args) {
		B4 b=new A4().ab();// b=101.ab() i.e. b=103
		System.out.println(b.y);// 103.y i.e. 10
		System.out.println(new A4().ab().y);// 104.ab().y i.e. 106.y
	}
}

class B4 {
	int y=10;
}
