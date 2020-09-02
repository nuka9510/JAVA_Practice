package CodeUp;

import java.util.Scanner;

public class Codeup_1051 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		long l = sc.nextLong(); // l = sc = 0
		long m = sc.nextLong(); // m = sc = -1
		
		if(l<=m) // l<=m = 0<=-1 = false
			System.out.println(1); // 1, 조건식이 true일 경우 출력한다.
		else
			System.out.println(0); // 0, 조건식이 false일 경우 출력한다.
		
		sc.close();
		}
	}

