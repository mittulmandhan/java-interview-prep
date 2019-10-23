class Integer {
	void integerCheck(int i) {
		if(i>0)
			System.out.println("Positive integer");
		else if(i==0)
			System.out.println("Zero");
		else
			System.out.println("Negative integer");
	}
	
	public static void main(String args[]) {
		Integer obj=new Integer();
		obj.integerCheck(-10);
	}
	
}