package CodeUp;

import java.util.Scanner;

public class Codeup_1071 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
			while(true) { // true일 경우 반복 실행
				int i = sc.nextInt(); // i = sc = 입력될 값, 입력창으로 출력됨
				if(i==0) { // 1==0 true일 경우 실행
					break; // if의 조건문이 true일 경우 실행
				}
				System.out.println(i); // i값을 출력
			}
		
			for(;true;) { // true일 경우 반복 실행, for(변수선언 및 초기화;조건문;반복할 연산자)
				int j = sc.nextInt(); // j = sc = 입력될 값, 입력창으로 출력됨
				if(j==0) { // j==0 true일 경우 실행
					break; // if의 조건문이 true일 경우 실행
				}
				System.out.println(j); // j값을 출력
			}
			sc.close();
		}
	}

