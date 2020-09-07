package CodeUp;

import java.util.Scanner;

public class Codeup_1060 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int i = sc.nextInt(); // i = sc = 3
		int j = sc.nextInt(); // i = sc = 5
		
		System.out.println(i&j); // 1, i&j = 3&5 = 011&101 = 001 = 1

		sc.close();
		}
	}

