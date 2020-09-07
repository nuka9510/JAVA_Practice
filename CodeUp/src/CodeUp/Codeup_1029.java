package CodeUp;

import java.util.Scanner;

public class Codeup_1029 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 3.14159265359
		double d = sc.nextDouble(); // d = sc = 3.14159265359, 변수(d)는 실수형으로 선언
		System.out.printf("%.11f", d); // 3.14159265359, %.11f이므로 소수점 아래 11자리까지 출력
		
		sc.close();
		}
	}

