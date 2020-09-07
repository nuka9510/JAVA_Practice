package CodeUp;

import java.util.Scanner;

public class Codeup_1085 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		float h = sc.nextInt(); // h = sc
		float b = sc.nextInt(); // b = sc
		float c = sc.nextInt(); // c = sc
		float s = sc.nextInt(); // s = sc
		
		if(h<=48000&&b<=32&&b%8==0&&c<=5&&s<=6000) { // h<=48000, b<=32, b%8=0, c<=5, s<=6000일 경우 실행한다.
			System.out.printf("%.1f MB", (((h*b*c*s)/8)/1024)/1024); // "((h*b*c*s)/8)/1024)/1024 MB"
		}
		
		sc.close();
	}
}

