
class Sum2Int {
	int a=10;
	int b=20;
	
	int sum() {
		int c=a+b;
		return c;
	}
	
	public static void main(String []args) {
		Sum2Int obj=new Sum2Int();
		System.out.println(obj.sum());
	}
};