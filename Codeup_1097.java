package CodeUp;

import java.util.Scanner;

public class Codeup_1097 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값

		int[][] arr = new int[19][19]; // arr[0][0]~arr[18][18]
		
		for(int i=0;i<arr.length;i++) { // i = 0, i<arr.length일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			for(int j=0;j<arr.length;j++) { // j = 0,j<arr.legnth일 경우 반복 실행한다., 실행한 뒤 j에 1을 더한 값으로 초기화 한다.
				arr[i][j] = sc.nextInt(); // arr[0][0]~arr[18][18] = sc
			}
		}
		
		int n = sc.nextInt(); // n = sc
		int x,y; // x,y변수 선언
		
		for(int i=0;i<n;i++) { // i = 0, i<n일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			x = sc.nextInt(); // x = sc
			for(int a=0;a<arr.length;a++) { // a = 0;, a<arr.length일 경우 반복 실행한다., 실행한 뒤 a에 1을 더한 값으로 초기화 한다.
				if(arr[x-1][a]==0) { // arr[x-1][0]~arr[x-1][18] = 0가 true일 경우 실행한다.
					arr[x-1][a] = 1; // arr[x-1][0]~arr[x-1][18] = 1
				}else {
					arr[x-1][a] = 0; /* arr[x-1][0]~arr[x-1][18] = 0가 false일 경우 실행한다.
					 					arr[x-1][0]~arr[x-1][18] = 0 */
				}
			}
			y = sc.nextInt(); // y = sc
			for(int b=0;b<arr.length;b++) { // b = 0;, b<arr.length일 경우 반복 실행한다., 실행한 뒤 b에 1을 더한 값으로 초기화 한다.
				if(arr[b][y-1]==0) { // arr[0][y-1]~arr[18][y-1] = 0가 true일 경우 실행한다.
					arr[b][y-1] = 1; // arr[0][y-1]~arr[18][y-1] = 1
				}else {
					arr[b][y-1] = 0; /* arr[0][y-1]~arr[18][y-1] = 0가 false일 경우 실행한다.
 										arr[0][y-1]~arr[18][y-1] = 0 */
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) { // i = 0, i<arr.length일 경우 반복실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			for(int j=0;j<arr.length;j++) { // j = 0, j<arr.length일 경우 반복실행한다., 실행한 뒤 j에 1을 더한 값으로 초기화 한다.
				System.out.print(arr[i][j]+" "); // "arr[i][0]~arr[i][18] "
			}
			System.out.println(); // 줄바꿈
		}
				
		sc.close();
	}
}

