package inflearn;

public class inflearn_14 {
	
	public String name;
	public String gender;
	public int age;
	
	public inflearn_14() {
		System.out.println("--ChildClass constructor--");
	}
	
	public void setInfo(String n,String g,int a) {
		System.out.println("--setInfo() START--");
		name = n;
		gender = g;
		age = a;
	}
	
	public void getInfo() {
		System.out.println("--getInfo() START--");
		
		System.out.println("name:"+name);
		System.out.println("gender:"+gender);
		System.out.println("age:"+age);
	}
	
	private void mySecret() {
		System.out.println("--mySecret()--");
	}

}
