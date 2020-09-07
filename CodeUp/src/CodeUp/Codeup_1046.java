package CodeUp;

import java.util.Scanner;

public class Codeup_1046 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		double d = sc.nextDouble(); // d = sc = 1
		double e = sc.nextDouble(); // e = sc = 2
		double f = sc.nextDouble(); // f = sc = 3
		
		System.out.printf("%.0f\n", d+e+f); // 6, d+e+f = 1+2+3 = 6
		System.out.printf("%.1f\n", (d+e+f)/3); // 2.0, (d+e+f)/3 = (1+2+3)/3 = 2.0, %.1f이므로 소수점 아래 1번째 자리까지 출력한다.
		
		sc.close();
		}
	}

