class StaticNonstaticCalling2 {
	static int x=10;
	int y=23;
	void ab() {
		// Non-static method ab() is calling static variable x
		// Non-static method ab() is calling non-static variable y
		System.out.println(x+y);
	}
	
	public static void main(String args[]) {
		// static main method is calling Nonstatic ab method
		StaticNonstaticCalling2 a=new StaticNonstaticCalling2();
		a.ab();
	}
};