package CodeUp;

import java.util.Scanner;

public class Codeup_1083 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		
		int i = sc.nextInt(); // i = sc
		int[] num = {3, 6, 9}; /* num[0] = 3
		 						  num[1] = 6
		 						  num[2] = 9 */
		
		for(int j = 1;j<=i;j++) { // j = 1, j<=i일 경우 반복 실행한다., 실행한 뒤 j에 1을 더한값으로 초기화 한다.
				if(j==num[0]||j==num[1]||j==num[2]) { // j=num[0] or j=num[1] or j=[2]일 경우 실행한다.
				System.out.print("X "); // "X "를 출력한다.
			}
			else {
				System.out.print(j+" "); // "j "를 출력한다.
			}
			if(j==num[2]) { // j=num[2]일 경우 실행한다.
				num[0]+=10; // num[0]에 10을 더한값으로 초기화 한다.
				num[1]+=10; // num[1]에 10을 더한값으로 초기화 한다.
				num[2]+=10; // num[2]에 10을 더한값으로 초기화 한다.
			}
		}
	
		sc.close();
	}
}

