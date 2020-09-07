package CodeUp;

import java.util.Scanner;

public class Codeup_1075 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		for(int i = sc.nextInt();i>0;i--) { // i = sc, i>0가 true일 경우 반복 실행한다., 한 번 실행 후 i-1을 한다.
			System.out.println(i-1); // i-1
		}
		
		sc.close();
		}
	}

