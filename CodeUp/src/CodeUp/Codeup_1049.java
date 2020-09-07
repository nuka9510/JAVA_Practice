package CodeUp;

import java.util.Scanner;

public class Codeup_1049 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		long l = sc.nextLong(); // l = sc = 9
		long m = sc.nextLong(); // m = sc = 1
		
		if(l>m) // l>m = 9>1 = true
			System.out.println(1); // 1, 조건식이 true일 경우 출력
		else
			System.out.println(0); // 0, 조건식이 false일 경우 출력
		
		sc.close();
		}
	}

