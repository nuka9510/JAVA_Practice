package CodeUp;

import java.util.Scanner;

public class Codeup_1061 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int i = sc.nextInt(); // i = sc = 3
		int j = sc.nextInt(); // j = sc = 5
		
		System.out.println(i|j); // 7, i|j = 3|5 = 0011|0101 = 0111 = 7

		sc.close();
		}
	}

