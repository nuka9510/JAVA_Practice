package inflearn_19.main;

import inflearn_19.employee.Employee;
import inflearn_19.employee.EmployeeBank;

public class Main {
	public static void main(String[] args) {
		EmployeeBank parkBank = new EmployeeBank("박찬호");
		parkBank.saveMoney(100);
		System.out.println();
		
		EmployeeBank leeBank = new EmployeeBank("이승엽");
		leeBank.saveMoney(300);
		System.out.println();
		
		leeBank.getBankInfo();
		System.out.println();
		
		parkBank.getBankInfo();
		System.out.println();

		/*
		leeBank.name = "박찬호"; // EmployeeBank클래스의 name변수가 public이므로
								     변경 가능함
		*/
		
		parkBank.spenMoney(400);
		System.out.println();
		
		leeBank.getBankInfo();
		System.out.println();
		
		parkBank.getBankInfo();
		System.out.println();
		
		Employee employee01 = new Employee("홍길동", 90);
		employee01.getInfo();
		
		/*
		employee01.score = 100; // Employee클래스의 score변수가 private이므로
								       변경 불가능함
		*/
		
		employee01.setScore(100);
		employee01.getInfo();
	}
}
