package CodeUp;

import java.util.Scanner;

public class Codeup_1039 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		long i = sc.nextLong(); // i = sc = 2147483648, 정수형 변수 long은 정수형 변수 int보다 더 큰 값을 지정 할 수 있다.
		long j = sc.nextLong(); // j = sc = 2147483648
		
		System.out.println(i+j); // 4294967296
		
		sc.close();
		}
	}

