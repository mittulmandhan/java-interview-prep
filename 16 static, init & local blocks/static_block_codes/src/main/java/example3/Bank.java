package example3;

public class Bank {
	int amt;
	
	Bank(int amt) {
		this.amt=amt;
	}
	
	public void showAmount() {
		System.out.println(this.amt);
	}
	
	public void depositAmount(int amt) {
		this.amt=this.amt+amt;
	}
	
	public void withdrawAmount(int amt) {
		this.amt=this.amt-amt;
	}
	
	public static void main(String[] args) {
		Bank mittul=new Bank(1000);
		mittul.showAmount();
		mittul.depositAmount(200);
		mittul.showAmount();
		mittul.withdrawAmount(500);
		mittul.showAmount();
	}
}
