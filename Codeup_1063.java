package CodeUp;

import java.util.Scanner;

public class Codeup_1063 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int i = sc.nextInt(); // i = sc = 123
		int j = sc.nextInt(); // j = sc = 456
		int k = (i>j) ? i:j; // k = 456, (i>j) ? i:j = i>j가 true일 경우 i false일 경우 j
		
		System.out.println(k); // 456

		sc.close();
		}
	}

