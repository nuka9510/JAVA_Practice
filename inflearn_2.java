package pjtTest;

public class inflearn_2 {

	public static void main(String[] args) {
		
		//변수 선언 및 초기화
		//변수 선언 시 같은 이름으로 선언 불가능 허나 변수 초기화로 변수 변경 가능
		int i = 10; // i = 10
		int j; // j변수 선언
		j = 100; // j = 100
		
		System.out.println("i+j="+(i+j)); // i+j, 110
		
		i = 200; // i변수 초기화, i = 200
		
		System.out.println("i+j="+(i+j)); // i+j, 300
	}
}
