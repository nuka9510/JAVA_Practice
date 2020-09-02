package CodeUp;

import java.util.Scanner;

public class Codeup_1072 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		for(int i = sc.nextInt();i>0;i--) { /* i = sc = 입력될 값(입력창-하위 실행문을 실행하기 전 한번만 표시된다.)
											    , i>0가 true이면 반복실행, 한 번 실행 후 i-1을 해준다. */
			int j = sc.nextInt(); // j = sc = 입력될 값
			System.out.println(j); // j
		}
		
		sc.close();
		}
	}

