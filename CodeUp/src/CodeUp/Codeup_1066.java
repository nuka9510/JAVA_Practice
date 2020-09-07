package CodeUp;

import java.util.Scanner;

public class Codeup_1066 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int i = sc.nextInt(); // i = sc = 1
		int j = sc.nextInt(); // j = sc = 2
		int k = sc.nextInt(); // k = sc = 8
		
		if(i%2==0) // i%2==0 = 1%2==0 = false
			System.out.println("even"); // even, 조건문이 true일 경우 출력한다.
		else
			System.out.println("odd"); // odd, 조건문이 false일 경우 출력한다.
		if(j%2==0) // 2%2==0 = 2%2==0 = true
			System.out.println("even"); // even, 조건문이 true일 경우 출력한다.
		else
			System.out.println("odd"); // odd, 조건문이 false일 경우 출력한다.
		if(k%2==0) // 8%2==0 = 8%2==0 = true
			System.out.println("even"); // even, 조건문이 true일 경우 출력한다.
		else
			System.out.println("odd"); // odd, 조건문이 false일 경우 출력한다.

		sc.close();
		}
	}

