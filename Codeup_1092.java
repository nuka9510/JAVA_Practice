package CodeUp;

import java.util.Scanner;

public class Codeup_1092 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int a = sc.nextInt(); // a = sc
		int b = sc.nextInt(); // b = sc
		int c = sc.nextInt(); // c = sc
		for(int day=1;true;day++) { // day = 1, 실행한 뒤 day에 1을 더한 값으로 초기화 한다.
			if(day%a==0&&day%b==0&&day%c==0) { // day%a=0, day%b=0, day%c=0일 경우 실행한다.
				System.out.println(day); // day
				break; // 실행됐을 경우 반복실행은 멈춘다.
			}
		}
		sc.close();
		}
}

