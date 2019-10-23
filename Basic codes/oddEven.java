class OddEven {
	void oddEvenCheck(int i) {
		if(i%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
	
	public static void main(String args[]) {
		OddEven obj=new OddEven();
		obj.oddEvenCheck(0);
	}
	
}