package CodeUp;

import java.util.Scanner;

public class Codeup_1034 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 13
		int i = sc.nextInt(8); // i = sc = 13, 변수(i)를 8진수로 초기화 함 
		System.out.printf("%d", i); // 11, 변수(i)는 8진수 이지만 %d이므로 10진수로 변환하여 출력한다.
		
		sc.close();
		}
	}

