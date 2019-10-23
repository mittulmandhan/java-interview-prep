class Pattern1 {
	void printPattern(int p) {
		for(int i=1;i<=p;i++) {
			for(int s=p;s>i;s--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int k=i-1;k>0;k--)
				System.out.print(k);
			System.out.println("");
		}
	}
	
	public static void main(String args[]) {
		Pattern1 obj1=new Pattern1();
		obj1.printPattern(5);
	}
	
}