package inflearn;

public class inflearn_14 {
	
	public String name; // 변수(name) 선언, 문자열 변수로 선언
	public String gender; // 변수(gender) 선언, 문자열 변수로 선언
	public int age; // 변수(age) 선언, 정수형 변수로 선언
	
	public inflearn_14() { // 생성자
		System.out.println("--ChildClass constructor--"); // --ChildClass constructor--
	}
	
	public void setInfo(String n,String g,int a) { // 메서드, 변수.setInfo(String n,String g,int a);형태로 사용가능, 괄호안에 값을 입력하면 해당 변수에 지정된다.
		System.out.println("--setInfo() START--"); // --setInfo() START--
		name = n; // name = n, 메서드 안의 변수
		gender = g; // gender = g, 메서드 안의 변수
		age = a; // age = a, 메서드 안의 변수
	}
	
	public void getInfo() { // 메서드, 변수.getInfo();형태로 사용가능
		System.out.println("--getInfo() START--"); // --getInfo() START--
		
		System.out.println("name:"+name); // 변수(name)에 지정된 값
		System.out.println("gender:"+gender); // 변수(gender)에 지정된 값
		System.out.println("age:"+age); //변수(age)에 지정된 값
	}
	
	private void mySecret() { // 메서드, 변수.mySecret();형태로 사용가능, private메서드 이므로 다른 클래스에서는 사용이 불가능 하다.
		System.out.println("--mySecret()--"); // --mySecret--
	}

}
