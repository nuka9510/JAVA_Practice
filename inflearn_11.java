package inflearn;

public class inflearn_11 { // 클래스 이름

	public String color; // color변수선언, 문자열 변수로 선언함
	public int price; // price변수선언, 정수형 변수로 선언함
	
	public inflearn_11() { // 생성자
		System.out.println("Bicycle constructor-1"); // Bicycle constructor-1
	}
	public inflearn_11(String c,int p) { // 생성자, 괄호안에 값을 입력하면 해당 변수에 지정된다.
		System.out.println("Bicycle constructor-2"); // Bicycle constructor-2
		color = c; // color = c, 생성자 안의 변수
		price = p; // price = p, 생성자 안의 변수
	}
	public void info() { // 메서드, 변수.info();형태로 사용 가능하다.
		System.out.println("--info--"); //--info--
		System.out.println("color:"+color); // 변수(color)에 지정된 값
		System.out.println("price:"+price); // 변수(price)에 지정된 값
	}
}
