class Scope {
	//x has class level scope
	static int x=10;
	//y has instance level scope
	int y;
	
	public int copy() {
		//z has local level 
		int z=21;
		return z;
	}
	
	
	
	public static void main(String args[]) {
		Scope obj=new Scope();
		
		System.out.println(x);
		System.out.println(obj.y);
		System.out.println(obj.copy());
	}
};