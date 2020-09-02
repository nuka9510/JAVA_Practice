package CodeUp;

import java.util.Scanner;

public class Codeup_1043 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		long l = sc.nextLong(); // l = sc = 10
		long m = sc.nextLong(); // m = sc = 3
		
		System.out.println(l%m); // 1, l%m = 10을 3으로 나눈 나머지 값
		
		sc.close();
		}
	}

