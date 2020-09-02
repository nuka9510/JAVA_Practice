package CodeUp;

import java.util.Scanner;

public class Codeup_1080 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int i = sc.nextInt(); // i = sc = 55
		int sum = 0; // sum = 0
		for(int j = 1;true;j++) { // j = 1, 조건문이 true일 경우 반복 실행한다., 실행 한 후 j를 1을 더한 값으로 초기화 한다.
			sum += j; // sum += j, sum = sum + j
			if(sum>=i) { // sum>=i가 true일 때 실행한다.
				System.out.println(j); // j
				break; // 실행됐을 경우 반복실행을 멈춘다.
			}
		}		
		sc.close();
	}
}

