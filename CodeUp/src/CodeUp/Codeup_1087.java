package CodeUp;

import java.util.Scanner;

public class Codeup_1087 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int n1 = sc.nextInt(); // n1 = sc
		int sum = 0; // sum = 0
		
		for(int n2 = 0;true;n2++) { // n2 = 0, 실행한 뒤 n2에 1을 더한 값으로 초기화 한다.
			sum += n2; // sum = sum+n2;, sum을 sum+n2의 값으로 초기화 한다.
			if(sum>=n1) { // sum>=n1일 경우 실행한다.
				System.out.println(sum); // sum
				break; // 실행됐을 경우 반복실행을 멈춘다.
			}
		}
		
		sc.close();
	}
}

