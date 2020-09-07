package CodeUp;

import java.util.Scanner;

public class Codeup_1053 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 1
		int i = sc.nextInt(); // i = sc = 1
		
		if(i==1) // i==1 = 1==1 = true
			System.out.println(0); // 0, 조건식이 true일 경우 출력한다.
		else if(i==0) // i==0 = i==0 = false
			System.out.println(1); // 1, 상위조건식이 false이고 현재 조건식이 true일 경우 출력한다.
		
		sc.close();
		}
	}

