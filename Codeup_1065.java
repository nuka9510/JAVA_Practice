package CodeUp;

import java.util.Scanner;

public class Codeup_1065 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int i = sc.nextInt(); // i = sc = 1
		int j = sc.nextInt(); // j = sc = 2
		int k = sc.nextInt(); // k = sc = 4
		
		if(i%2==0) // i%2==0 = 1%2==0 = false
			System.out.println(i); // 조건문이 true일 경우 출력한다.
		if(j%2==0) // j%2==0 = 2%2==0 = true
			System.out.println(j); // 조건문이 true일 경우 출력한다.
		if(k%2==0) // k%2==0 = 4%2==0 = true
			System.out.println(k); // 조건문이 true일 경우 출력한다.

		sc.close();
		}
	}
