package CodeUp;

import java.util.Scanner;

public class Codeup_1098 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값

		int h = sc.nextInt(); // h = sc
		int w = sc.nextInt(); // w = sc
		int[][] arr = new int[h][w]; // arr[0][0]~arr[h-1][w-1]변수 선언
		int n = sc.nextInt(); // n = sc
		
		for(int a=0;a<n;a++) { // a = 0, a<n일 경우 반복실행, 실행한 뒤 a에 1을 더한 값으로 초기화 한다.
			int l = sc.nextInt(); // l = sc
			int d = sc.nextInt(); // d = sc
			int x = sc.nextInt(); // x = sc
			int y = sc.nextInt(); // y = sc
			
			for(int i=0;i<l;i++) { // i = 0, i<l일 경우 반복 실행, 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
				if(d==0) { // d==0일 경우 실행 한다.
					arr[x-1][y+i-1] = 1; // d==0가 true일 경우 실행한다.
				}else {
					arr[x+i-1][y-1] = 1; // d==0가 false일 경우 실행한다.
				}
			}
		}
		
		for(int i=0;i<h;i++) { // i = 0, i<h일 경우 반복 실행, 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			for(int j=0;j<w;j++) { // j = 0, j<w일 경우 반복 실행, 실행한 뒤 j에 1을 더한 값으로 초기화 한다.
				System.out.print(arr[i][j]+" "); // "arr[i][0]~arr[i][j] "
			}
			System.out.println(); // 줄바꿈
		}
				
		sc.close();
	}
}
