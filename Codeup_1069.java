package CodeUp;

import java.util.Scanner;

public class Codeup_1069 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = A
		String s = sc.next(); // s = sc = A
		
		switch(s) {
		case "A": // s==A = true
			System.out.println("best!!!"); // 조건 case가 true일 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		case "B": // s==B = false
			System.out.println("good!!"); // 조건 case가 true일 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		case "C": // s==C = false
			System.out.println("run!"); // 조건 case가 true일 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		case "D": // s==D = false
			System.out.println("slowly~"); // 조건 case가 true일 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		default: // case들 모두에 해당 하지않을 경우 실행한다.
			System.out.println("what?"); // default가 샐행 될 경우 출력한다.
		break; // default가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		}

		sc.close();
		}
	}

