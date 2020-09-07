package CodeUp;

import java.util.Scanner;

public class Codeup_1036 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = A
		String s = sc.next(); // s = sc = A
		int i = (int)s.charAt(0); /* i = s = 65(A),
									 (int)s.charAt(0);로 입력했을 때
									 charAt(0)은 아스키코드에서 변수(s)에 해당하는 10진수 값을 찾아내고 그 값으로 지정한다.
									  그리고 변수(s)는 문자열 변수 이지만 (int)를 입력 함으로써 정수형으로 변환 해준다. */
		System.out.println(i); // 65
		
		sc.close();
		}
	}
