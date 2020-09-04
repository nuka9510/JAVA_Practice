package CodeUp;

import java.util.Scanner;

public class Codeup_1093 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값

		int n = sc.nextInt(); // n = sc
		int[] arr = new int[n]; // arr[0]~arr[n-1]변수 선언
		
		for(int i=0;i<arr.length;i++) { // i = 0, i<arr.length(배열길이)일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값을 초기화 한다.
			arr[i] = sc.nextInt(); // arr[0]~arr[i] = sc
		}
		
		int[] total = new int[23]; // total[0]~total[22]변수 선언
		
		for(int i=0;i<arr.length;i++) { // i = 0, i<arr.length(배열길이)일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값을 초기화 한다.
			total[arr[i]-1]++; /* 실행한 뒤 total[arr[0]-1]~total[arr[i]-1]에 1을 더한 값을 초기화 한다.
			 					    배열의 번호는 0부터 시작하므로 arr[i]-1해준다.*/
		}
		
		for(int i=0;i<total.length;i++) { // i = 0, i<total.length일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값을 초기화 한다.
			System.out.print(total[i]+" "); // "total[i] "
		}
		
		sc.close();
	}
}

