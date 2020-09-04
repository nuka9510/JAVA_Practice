package CodeUp;

import java.util.Scanner;

public class Codeup_1081 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int i = sc.nextInt(); // i = sc = 2
		int j = sc.nextInt(); // i = sc = 3
		
		for(int k = 1;k<=i;k++) { // k = 1, k<=i가 true일 경우 반복 실행한다., 실행한 뒤 k에 1을 더한 값으로 초기화 한다.
			for(int l = 1;l<=j;l++) { // l = 1, l<=j가 true일 경우 반복 실행한다., 실행한 뒤 l에 1을 더한 값으로 초기화 한다.
				System.out.printf("%d %d\n", k, l); // "k j"를 출력한다.
			}
		}
	
		sc.close();
	}
}

