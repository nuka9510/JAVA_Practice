package inflearn_19.employee;

public class EmployeeBank {
	public String name;
	static int amount = 0;
	
	public EmployeeBank(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		amount += money;
		System.out.println("amount : " + amount);
	}
	
	public void spenMoney(int money) {
		amount -= money;
		System.out.println("amount : " + amount);
	}
	
	public void getBankInfo() {
		System.out.println("Employee name : " + this.name);
		System.out.println("amount : " + amount);
	}

}
