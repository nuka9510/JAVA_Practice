package CodeUp;

import java.util.Scanner;

public class Codeup_1023 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 1.414213
		String s = sc.next(); // s = 1.414213
		String[] arr = s.split("\\."); // arr[0] = 1, arr[1] = 414213 
		System.out.printf("%s\n%s",arr[0],arr[1]); /* 1
		 											  4142123 */
		
		sc.close();
	}

}

