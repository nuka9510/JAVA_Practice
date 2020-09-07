package CodeUp;

import java.util.Scanner;

public class Codeup_1054 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int i = sc.nextInt(); // i = sc = 1
		int j = sc.nextInt(); // j = sc = 1
		
		if(i==1) // i==1 = 1==1 = true
			if(j==1) // j==1 = 1==1 = true
				System.out.println(1); // 1, 상위 조건식이 true이고 하위 조건식도 true일 경우 출력한다.
			else
				System.out.println(0); // 0, 상위 조건식이 true이고 하위 조건식이 false일 경우 출력한다.
		if(i==0) // i==0 = 1==0 = false
			System.out.println(0); // 0, 조건식이 true일 경우 출력한다.

		sc.close();
		}
	}

