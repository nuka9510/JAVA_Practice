package CodeUp;

import java.util.Scanner;

public class Codeup_1099 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		int[][] arr = new int[10][10]; // arr[0][0]~arr[9][9]변수 선언
		for(int a=0;a<arr.length;a++) { // a = 0, a<arr.length일 경우 반복 실행한다., 실행한 뒤 a에 1을 더한 값으로 초기화 한다.
			for(int b=0;b<arr.length;b++) { // b = 0, b<arr.length일 경우 반복 실행한다., 실행한 뒤 b에 1을 더한 값으로 초기화 한다.
				arr[a][b] = sc.nextInt(); // arr[0][0]~arr[a][b] = sc
			}
		}
		int a=1; // a = 1
		int b=1; // b = 1
		for(;a<arr.length-1;b++){ // a<arr.length일 경우 반복 실행한다., 실행한 뒤 b에 1을 더한 값으로 초기화 한다.
				if(arr[a][b]==1) { // arr[a][b] = 1일 경우 실행한다.
					a+=1; // a를 a+1의 값으로 초기화 한다.
					b-=1; // b를 b-1의 값으로 초기화 한다.
				}
				if(arr[a][b]==0) { // arr[a][b] = 0일 경우 실행한다.
					arr[a][b] = 9; // arr[a][b] = 9
				}else if(arr[a][b]==2) { // arr[a][b] = 2일 경우 실행한다.
					arr[a][b]=9; // arr[a][b] = 9
					break; // 실행됐을 경우 반복 실행을 멈춘다.
				}else if(arr[a][b]==1){ // arr[a][b] = 1일 경우 실행한다.
					break; // 실행됐을 경우 반복 실행을 멈춘다.
				}						
		}
		for(int i=0;i<arr.length;i++) { // i = 0, i<arr.length일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			for(int j=0;j<arr.length;j++) { // j = 0, j<arr.length일 경우 반복 실행한다., 실행한 뒤 j에 1을 더한 값으로 초기화 한다.
				System.out.print(arr[i][j]+" "); // "arr[i][0]~arr[i][j] "
			}
			System.out.println(); // 줄 바꿈
		}
		sc.close();
	}
}
