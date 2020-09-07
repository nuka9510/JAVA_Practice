package CodeUp;

import java.util.Scanner;

public class Codeup_1037 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 65
		int i = sc.nextInt(); // i = sc = 65
		char s = (char)i; // s = i = A(65), (char)을 입력 하므로써 변수(i)를 문자형으로 변환하여 변수(s)를 초기화 한다.
		
		System.out.println(s); // A
		
		sc.close();
		}
	}

