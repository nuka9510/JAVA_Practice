package CodeUp;

import java.util.Scanner;

public class Codeup_1076 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		char c = 'a'; // c = a, char는 문자형 변수
		
		for(char d = sc.next().charAt(0);d>=c;) { /* d = sc = 입력될 값, next는 String문자열 값이기 때문에 charAt으로 문자값을 받는다.
		 											 d>=c가 true일 경우 반복 실행한다. */
			System.out.printf("%c ",c++); // c, 실행 할 때마다 1씩 더해준다.
		}
			
		sc.close();
		}
	}

