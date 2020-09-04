package CodeUp;

import java.util.Scanner;

public class Codeup_1094 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값

		int n = sc.nextInt(); // n = sc
		int[] arr = new int[n]; // arr[0]~arr[n-1]변수 선언
		
		for(int i=0;i<arr.length;i++) { // i = 0, i<arr.length(변수길이)일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			arr[i] = sc.nextInt(); // arr[0]~arr[i] = sc
		}
		for(int i=n;i>0;i--) { // i = n, i>0일 경우 반복 실행한다., 실행한 뒤 i에 1을 뺀 값으로 초기화 한다.
			System.out.printf(arr[i-1]+" "); // "arr[i-1] "
		}
		
		sc.close();
	}
}

