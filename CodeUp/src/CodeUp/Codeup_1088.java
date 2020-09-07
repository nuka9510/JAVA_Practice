package CodeUp;

import java.util.Scanner;

public class Codeup_1088 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int n1 = sc.nextInt(); // n1 = sc
		
		for(int n2 = 1;n2<=n1;n2++) { // n2 = 1, n2<=n1일 경우 반복 실행한다., 실행한 뒤 n2에 1을 더한 값으로 초기화 한다.
			if(n2%3!=0) { // n2%3!=0, n2%3이 0이 아닐 경우 실행한다.
				System.out.print(n2+" "); // "n2 "
			}
		}
		
		sc.close();
	}
}

