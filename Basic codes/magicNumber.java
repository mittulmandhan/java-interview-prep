class MagicNumber {
	int x;
	
	MagicNumber(int num) {
		x=num;
	}
	
	boolean isMagicNumber() {
		int temp=x;
		while(temp>=10) {
			int digitSum=0;
			while(temp>0) {
				digitSum=digitSum+(temp%10);
				temp=temp/10;
			}
			temp=digitSum;
		}
		if(temp==1)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		MagicNumber obj=new MagicNumber(199);
		boolean mn=obj.isMagicNumber();
		
		if(mn)
			System.out.println("Magic Number");
		else
			System.out.println("Not a Magic Number");

	}
}