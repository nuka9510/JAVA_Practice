package CodeUp;

import java.util.Scanner;

public class Codeup_1073 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		for(;true;) { // 조건문이 true일 경우 반복 실행한다.
			int i = sc.nextInt(); // i = sc = 입력될 값
			
			if(i==0) { // i==0가 true일 경우 실행한다.
				break; // 반복실행을 멈춘다.
			}
			System.out.println(i); // i
		}
		
		sc.close();
		}
	}

