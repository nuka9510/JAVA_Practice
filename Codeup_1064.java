package CodeUp;

import java.util.Scanner;

public class Codeup_1064 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int i = sc.nextInt(); // i = sc = 3
		int j = sc.nextInt(); // j = sc = -1
		int k = sc.nextInt(); // k = sc = 5
		int l = (i>j) ? (j>k) ? k:j:(i>k) ? k:i; /* l = -1, (i>j)가 true일 경우 (j>k) ? k:j
																		 	 (j>k)가 true일 경우 k false일 경우 j
		 													 (i>j)가 false일 경우 (i>k) ? k:i
		 																 	   (i>k)가 true일 경우 k false일 경우 i */
		
		System.out.println(l); // -1

		sc.close();
		}
	}

