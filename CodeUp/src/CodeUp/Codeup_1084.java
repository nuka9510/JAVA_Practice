package CodeUp;

import java.util.Scanner;

public class Codeup_1084 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int r1 = sc.nextInt(); // r1 = sc
		int g1 = sc.nextInt(); // r2 = sc
		int b1 = sc.nextInt(); // r3 = sc
		int r2 = 0; // r2 = 0
		int g2 = 0; // g2 = 0
		int b2 = 0; // b2 = 0
		int rgb = 0; // rgb = 0
		
		for(r2 = 0;r2<r1;r2++) { // r2 = 0, r2<r1이 true일 경우 반복실행한다., 실행한 뒤 r2에 1을 더한값으로 초기화 한다.
			for(g2 = 0;g2<g1;g2++) { // g2 = 0, g2<g1이 true일 경우 반복실행한다., 실행한 뒤 g2에 1을 더한값으로 초기화 한다.
				for(b2 = 0;b2<b1;b2++) { // b2 = 0, b2<b1이 true일 경우 반복실행한다., 실행한 뒤 b2에 1을 더한값으로 초기화 한다.
					System.out.printf("%d %d %d\n", r2, g2, b2); // "r2 g2 b2"를 출력한다.
					rgb++; // 실행한 뒤 rgb에 1을 더한값으로 초기화 한다. 
				}
			}
		}
		
		System.out.println(rgb); // rgb
	
		sc.close();
	}
}

