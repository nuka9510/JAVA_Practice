package CodeUp;

import java.util.Scanner;

public class Codeup_1086 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		float w = sc.nextInt(); // w = sc
		float h = sc.nextInt(); // h = sc
		float b = sc.nextInt(); // b = sc
		
		if(w>=1&&w<=1024&&h>=1&&h<=1024&&b%4==0&&b<=40) { // w>=1, w<=1024, h>=1, h<=1024, b%4=0, b<=40일 경우 실행한다.
			System.out.printf("%.2f MB", (((w*h*b)/8)/1024)/1024); // "((w*h*b)/8)/1024)/1024 MB"
		}
		
		sc.close();
	}
}

