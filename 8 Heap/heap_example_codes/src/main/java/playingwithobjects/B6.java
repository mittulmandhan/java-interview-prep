package playingwithobjects;

// chaining rule
public class B6 {
	C1 ab() {
		return new C1();// 102
	}
	
	public static void main(String[] args) {
		System.out.println(new B6().ab().y);// 101.102.y i.e. 20 
	}
}

class C1 {
	int y=20;
}


