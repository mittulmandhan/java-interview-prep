package playingwithobjects;

// showing independence of each individual object
public class A3 {
	int x=10;
	//default constructor call
	
	public static void main(String[] args) {
		A3 obj1=new A3();// obj1=101
		A3 obj2=new A3();// obj2=102
		
		obj1.x=40;// 101.x=40
		
		System.out.println(obj1.x);// 40
		System.out.println(obj2.x);// 10
	}
}
