package CodeUp;

import java.util.Scanner;

public class Codeup_1050 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 ㄱ밧
		long l = sc.nextLong(); // l = sc = 0
		long m = sc.nextLong(); // m = sc = 0
		
		if(l==m) // l==m = 0==0 = true
			System.out.println(1); // 1, 조건식이 true일 경우 출력한다.
		else
			System.out.println(0); // 0, 조건식이 fale일 경우 출력한다.
		
		sc.close();
		}
	}

