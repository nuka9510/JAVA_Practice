package CodeUp;

import java.util.Scanner;

public class Codeup_1079 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값

		for(;true;) { // 조건문이 true일 경우 반복실행한다.
			char c = sc.next().charAt(0); // c = sc, Scanner는 문자형 값이 아니라 문자열 값을 받으므로 charAt으로 문자형 값으로 변환한다.
		
			System.out.println(c); // c
			if(c=='q') { // c==q가 true일 경우 실행한다.
				break; // 실행됐을 경우 반복실행을 멈춘다.
			}
		}
			
		sc.close();
		}
	}

