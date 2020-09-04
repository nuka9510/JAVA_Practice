package CodeUp;

import java.util.Scanner;

public class Codeup_1096 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값

		int n = sc.nextInt(); // n = sc
		int[][] arr = new int[19][19]; // arr[0][0]~arr[19][19]변수 선언
		int x,y; // x,y변수 선언
		
		for(int i=0;i<n;i++) { // i = 0, i<n일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			x = sc.nextInt(); // x = sc
			y = sc.nextInt(); // y = sc
			arr[x-1][y-1] = 1; // arr[x-1][y-1] = 1
		}
		
		for(int i=0;i<arr.length;i++) { // i = 0, i<arr.length(변수길이)일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			for(int j=0;j<arr.length;j++) { // j = 0, j<arr.length(변수길이)일 경우 반복 실행한다., 실행한 뒤 j에 1을 더한 값으로 초기화 한다.
				System.out.print(arr[i][j]+" "); // "arr[i][0]~arr[i][j] "
			}
			System.out.println(); // 줄바꿈
		}
		
		sc.close();
	}
}

