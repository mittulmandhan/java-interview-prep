class StaticNonstaticCalling1 {
	static int x=10;
	int y=23;
	static void ab() {
		// static method ab() is calling static variable x
		// static method ab() is calling non-static variable y
		StaticNonstaticCalling1 obj=new StaticNonstaticCalling1();
		System.out.println(x+obj.y);
	}
	
	public static void main(String args[]) {
		// static main method is calling static ab method
		ab();
	}
};