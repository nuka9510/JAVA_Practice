package CodeUp;

import java.util.Scanner;

public class Codeup_1078 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 5
		
		int j = 0; // j = 0

		for(int i = sc.nextInt();i>0;i--) { // i = sc = 5, i>0가 true일 경우 반복실행한다., 실행 후 i를 1을 뺀 값으로 초기화한다.
			if(i%2==0) { // i%2==0이 true일 경우 실행한다.
				j = j + i; /* 0 = 0 + 4
				 			  4 = 4 + 2
				 			  6 = 6 + 0
				 			  j = 6 = 4+2*/
			}
		}
		System.out.println(j); // 6
			
		sc.close();
		}
	}

