package inflearn_19.main;

import inflearn_19.employee.EmployeeBank;

public class Main {
	public static void main(String[] args) {
		EmployeeBank parkBank = new EmployeeBank("¹ÚÂùÈ£");
		parkBank.saveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("ÀÌ½Â¿±");
		leeBank.saveMoney(300);
		
		leeBank.getBankInfo();
		parkBank.getBankInfo();
		
		parkBank.spenMoney(400);
		
		leeBank.getBankInfo();
		parkBank.getBankInfo();
		
	}
}
