package CodeUp;

import java.util.Scanner;

public class Codeup_1027 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 2014.07.15
		String s = sc.next(); // s = sc = 2014.07.15
		String[] arr = s.split("\\."); /* arr[0] = 2014
		 								  arr[1] = 07
		 								  arr[2] = 15 */

		System.out.printf("%s-%s-%s", arr[2], arr[1], arr[0]); // 15-07-2014
		
		sc.close();
		}
	}

