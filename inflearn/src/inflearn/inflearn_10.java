package inflearn;

public class inflearn_10 { // 클래스 이름, 파일명하고 동일, 일반적으로는 첫글자를 대문자로 사용한다, public클래스 이므로 다른 클래스에서 호출이 가능하다.
	
	public String color; // color변수 선언, 문자열 변수로 선언함, public으로 선언하였으므로 다른 클래스에서 호출가능 하다.
	public String gear; // gear변수 선언
	public int price; // price변수 선언, 정수형 변수로 선언함
	
	public inflearn_10() { // 생성자, 클래스가 호출됐을 경우 실행한다.
		System.out.println("Grandeur constructor"); // Grandeur constructor
	}
	public void run() { // 메서드(기능), 클래스가 호출됐을 경우 실행이 가능해진다., 현재 메서드는 호출된 클래스에서 변수.run(); 형태로 사용가능하다.
		System.out.println("--run--"); // --run--
	}
	public void stop() { // 변수.stop(); 형태로 사용 가능하다.
		System.out.println("--stop--"); //--stop--
	}
	
	public void info() { // 현재 메서드 안에 있는 실행문을 모두 실행한다., 변수.info(); 형태로 사용 가능하다.
		System.out.println("--info--"); // --info--
		System.out.println("color:"+color); // 변수(color)에 지정된 값
		System.out.println("gear:"+gear); // 변수(gear)에 지정된 값
		System.out.println("price:"+price); // 변수(price)에 지정된 값
	}
}
