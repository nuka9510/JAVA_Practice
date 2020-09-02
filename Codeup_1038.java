package CodeUp;

import java.util.Scanner;

public class Codeup_1038 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		long i = sc.nextLong(); // i = sc = 123, 정수형 변수 long은 정수형 변수 int보다 더 큰 값을 지정 할 수 있다.
		long j = sc.nextLong(); // j = sc = -123
		
		System.out.println(i+j); // 0
		
		sc.close();
		}
	}

