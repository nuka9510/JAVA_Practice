package inflearn;

import java.util.Scanner;

public class inflearn_8 {
	
	public static void main(String[] args) {
		//조건문
		int num1 = 10; // num1 = 10
		int num2 = 20; // num2 = 20
		
		//if(조건식)
		if(num1 < num2) { // true
			System.out.println("num1는 num2보다 작다."); // num1는 num2보다 작다., 조건식 계산 값이 true이므로 값을 출력한다.
		}
		
		if(num1 > num2) { // false
			System.out.println("num1는 num2보다 작다."); // 조건식 계산 값이 false이므로 값을 출력하지 않는다.
		}
		
		System.out.println();
		
		//if(조건식) else
		if(num1 < num2) { // true
			System.out.println("num1는 num2보다 작다."); // num1는 num2보다 작다., 조건식 계산 값이 true이므로 값을 출력한다.
		} else {
			System.out.println("num1는 num2보다 크거나 같다."); // 조건식 계산 값이 true이므로 값을 출력하지 않는다.
		}
		
		num1 = 20; // num1 = 20
		num2 = 10; // num2 = 10
		
		if(num1 < num2) { // false
			System.out.println("num1는 num2보다 작다."); // 조건식 값이 false이므로 값을 출력하지 않는다.
		} else {
			System.out.println("num1는 num2보다 크거나 같다."); // num1는 num2보다 크거나 같다., 조건식 값이 false이므로 값을 출력한다.
		}
		
		System.out.println();
		
		//if(조건식) else if(조건식)
		num1 = 10; // num1 = 10
		num2 = 20; // num2 = 20
		
		if(num1 < num2) { // true
			System.out.println("num1는 num2보다 작다."); // num1는 num2보다 작다., 조건식 값이 true이므로 값을 출력한다., 값을 출력했으므로 하위 조건식은 출력하지 않는다.
		} else if(num1 > num2){ // false
			System.out.println("num1는 num2보다 크다."); // 조건식 값이 false이므로 값을 출력하지 않는다.
		} else {
			System.out.println("num1는 num2와 같다."); // 조건식 값이 false이지만 상위 조건식 값이 출력 되었으므로 값을 출력하지 않는다.
		}
		
		num1 = 20; // num1 = 20
		num2 = 10; // num2 = 10
		
		if(num1 < num2) { // false
			System.out.println("num1는 num2보다 작다."); // 조건식 값이 false이므로 값을 출력하지 않는다.
		} else if(num1 > num2){ // true
			System.out.println("num1는 num2보다 크다."); // num1는 num2보다 크다., 조건식 값이 true이므로 값을 출력한다.
		} else {
			System.out.println("num1는 num2와 같다."); // 값이 true이므로 값을 출력하지 않는다.
		}
		
		num1 = 10; // num1 = 10
		num2 = 10; // num2 = 10
		
		if(num1 < num2) { // false
			System.out.println("num1는 num2보다 작다."); // 조건식 값이 false이므로 값을 출력하지 않는다.
		} else if(num1 > num2){ // false
			System.out.println("num1는 num2보다 크다."); // 조건식 값이 false이므로 값을 출력하지 않는다.
		} else {
			System.out.println("num1는 num2와 같다."); // num1는 num2와 같다., 조건식이 false이므로 값을 출력한다.
		}
		
		System.out.println();
		
		//switch문
		System.out.print("점수를 입력하세요.:"); // 점수를 입력하세요.:
		Scanner sc = new Scanner(System.in); // sc = 입력할 값
		int score = sc.nextInt(); // score = sc = 입력할 값, 입력창으로 출력됨
		
		switch (score) {
		    case 100:
			case 90:
				System.out.println("수"); // score에 입력한 값이 100, 90일 경우 출력한다.
			break; // 실행문이 실행을 하였을 경우 나머지 실행문은 실행하지 않는다.
			
			case 80:
				System.out.println("우"); // score에 입력한 값이 80일 경우 출력한다.
			break;
			
			case 70:
				System.out.println("미"); // score에 입력한 값이 70일 경우 출력한다.
			break;
			
			default:
				System.out.println("try again!!"); // case로 지정한 값이 아닐경우 출력한다.
			break;
		}
		
		sc.close();
		
	}

}
