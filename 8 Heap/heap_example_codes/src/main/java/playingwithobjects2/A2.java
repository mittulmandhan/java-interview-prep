package playingwithobjects2;

// we make reference when we want to call that object(again and again) more than once
// but remember every time we use new keyword and create an object a whole new copy of the given class is created
// and we have to store the reference of that object in a reference variable to access it again otherwise we lose the access to that particular object
public class A2 {
	int x=10;
	
	public static void main(String[] args) {
		System.out.println(new A2().x);// 101.x i.e. 10
		System.out.println(new A2().x);// 102.x i.e. 10
	}
}
