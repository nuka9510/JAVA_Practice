package CodeUp;

import java.util.Scanner;

public class Codeup_1041 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = a
		String s = sc.next(); // s = sc = a
		
		System.out.printf("%c",s.charAt(0)+1); // b, s.charAt(0)+1 = 65+1 = 66, %c이므로 변수값을 문자형으로 출력한다.
		
		sc.close();
		}
	}

