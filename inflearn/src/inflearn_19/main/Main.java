package inflearn_19.main;

import inflearn_19.employee.Employee;
import inflearn_19.employee.EmployeeBank;

public class Main {
	public static void main(String[] args) {
		EmployeeBank parkBank = new EmployeeBank("����ȣ");
		parkBank.saveMoney(100);
		System.out.println();
		
		EmployeeBank leeBank = new EmployeeBank("�̽¿�");
		leeBank.saveMoney(300);
		System.out.println();
		
		leeBank.getBankInfo();
		System.out.println();
		
		parkBank.getBankInfo();
		System.out.println();

		/*
		leeBank.name = "����ȣ"; // EmployeeBankŬ������ name������ public�̹Ƿ�
								     ���� ������
		*/
		
		parkBank.spenMoney(400);
		System.out.println();
		
		leeBank.getBankInfo();
		System.out.println();
		
		parkBank.getBankInfo();
		System.out.println();
		
		Employee employee01 = new Employee("ȫ�浿", 90);
		employee01.getInfo();
		
		/*
		employee01.score = 100; // EmployeeŬ������ score������ private�̹Ƿ�
								       ���� �Ұ�����
		*/
		
		employee01.setScore(100);
		employee01.getInfo();
	}
}
