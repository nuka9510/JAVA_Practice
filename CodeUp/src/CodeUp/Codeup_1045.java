package CodeUp;

import java.util.Scanner;

public class Codeup_1045 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		double d = sc.nextDouble(); // d = sc = 10
		double e = sc.nextDouble(); // e = sc = 3
		
		System.out.printf("%.0f\n", d+e); // 13, d+e = 10+3 = 13, %.0f이므로 소수점 아래 0번째 자리까지 출력한다.
		System.out.printf("%.0f\n", d-e); // 7, d-e = 10-3 = 7
		System.out.printf("%.0f\n", d*e); // 30, d*e = 10*3 = 30
		System.out.printf("%.0f\n", d/e); // 3, d/e = 10/3 = 3
		System.out.printf("%.0f\n", d%e); // 1, d%e = 10%3 = 1
		System.out.printf("%.2f", d/e); // 3.33, d/e = 10/3 = 3.33, %.2f이므로 소수점 아래 2번째 자리까지 출력한다.
		
		sc.close();
		}
	}

