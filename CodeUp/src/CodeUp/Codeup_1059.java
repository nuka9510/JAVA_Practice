package CodeUp;

import java.util.Scanner;

public class Codeup_1059 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 2
		int i = sc.nextInt(); // i = sc = 2
		
		System.out.println(~i); // -3, ~i = NOTi = NOT2 = NOT(…0010) = …1101 = -3

		sc.close();
		}
	}

