package inflearn_19.employee;

import inflearn_19.dailyJournal.DailyJournal;
import inflearn_19.dailyJournal.ObjectClass;

public class Employee {
	
	DailyJournal journal = new DailyJournal();
	ObjectClass objectclass = new ObjectClass();
	
	private String name;
	private int score;
	
	public Employee(String s, int i) {
		this.name = s;
		this.score = i;
	}
	
	public void getInfo() {
		System.out.println("--getInfo()--");
		System.out.println(" name : "+name);
		System.out.println(" score : "+score);
	}

	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
