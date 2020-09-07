package CodeUp;

import java.util.Scanner;

public class Codeup_1070 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 12
		int i = sc.nextInt(); // i = sc = 12
		
		switch(i) {
		case 12: // i==12 = true
		case 1: // i==1 = false
		case 2: // i==2 = false
			System.out.println("winter"); // 조건 case들 중 true가 있을 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		case 3: // i==3 = false
		case 4: // i==4 = false
		case 5: // i==5 = false
			System.out.println("spring"); // 조건 case들 중 true가 있을 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		case 6: // i==6 = false
		case 7: // i==7 = false
		case 8: // i==8 = false
			System.out.println("summer"); // 조건 case들 중 true가 있을 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		case 9: // i==9 = false
		case 10: // i==10 = false
		case 11: // i==11 = false
			System.out.println("fall"); // 조건 case들 중 true가 있을 경우 출력한다.
		break; // case가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		default: // case들 모두에 해당 하지않을 경우 실행한다.
			System.out.println("season"); // default가 샐행 될 경우 출력한다.
		break; // default가 실행됐을 경우 이 지점에서 switch의 실행을 멈춘다.
		}

		sc.close();
		}
	}

