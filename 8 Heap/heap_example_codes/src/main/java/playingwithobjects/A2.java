package playingwithobjects;

//editing the value of instance variable stored in object
public class A2 {
	int x=10;// 101.x=10
	//default constructor call
	
	public static void main(String[] args) {
		A2 obj=new A2();// obj=101
		System.out.println(obj.x);// 10
		obj.x=30;// 101.x=30
		System.out.println(obj.x);// 30
	}
}
