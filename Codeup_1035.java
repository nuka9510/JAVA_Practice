package CodeUp;

import java.util.Scanner;

public class Codeup_1035 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = f
		int i = sc.nextInt(16); // i = sc = f, 변수(i)를 16진수로 초기화 함
		System.out.printf("%o", i); // 17, 변수(i)는 16진수 이지만 %o이므로 8진수로 변환하여 출력한다.
		
		sc.close();
		}
	}

