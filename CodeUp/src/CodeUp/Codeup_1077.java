package CodeUp;

import java.util.Scanner;

public class Codeup_1077 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int i = 0; // i = 0
		
		for(int j = sc.nextInt();j>=i;) { // j = 입력될 값, j>=i가 true일 경우 반복 실행한다.
			System.out.println(i++); // i를 출력하고 1을 더한값을 i에 초기화 시킨다.
		}
			
		sc.close();
		}
	}

