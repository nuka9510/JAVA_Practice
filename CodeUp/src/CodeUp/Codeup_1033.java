package CodeUp;

import java.util.Scanner;

public class Codeup_1033 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 255
		int i = sc.nextInt(); // i = sc =255
		System.out.printf("%X", i); // FF, %x가 아닌 %X이므로 대문자로 출력된다.
		
		sc.close();
		}
	}

