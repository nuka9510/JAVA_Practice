package inflearn_22;

public abstract class Bank {
	
	String name;
	String account;
	int totalAmount;
	
	public Bank() {
		System.out.println("Bank constructor");
	}
	
	public Bank(String name, String account, int totalAmount) {
		System.out.println("Bank constructor");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	public void deposit() {
		System.out.println("-- deposit() START --");
	}
	
	public void withdraw() {
		System.out.println("-- withdraw() START --");
	}
	
	public abstract void installmentSavings();
	
	public abstract void cancellation();
	
	public void getInfo() {
		System.out.println("name : "+this.name);
		System.out.println("account : "+this.account);
		System.out.println("totalAmount : "+this.totalAmount);
	}

}
