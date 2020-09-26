package CodeUp;

import java.util.Scanner;

public class Codeup_1174 {
	
	public static void main(String[] args) {
		/* if, switch, 삼항연산자 사용 없이 30분 전 시간 구하기 */
		Scanner sc = new Scanner(System.in);
		int[] time = new int[2];
		
		for(int i=0;i<time.length;i++) {
			time[i] = sc.nextInt();
		}
		
		for(int i=0;i<30;i++) {
			time[1]--;
			while(time[1]<0) {
				time[0]--;
				time[1] = 59;
				while(time[0]<0) {
					time[0] = 23;
				}
			}
		}
		
		
		System.out.printf("%d %d", time[0], time[1]);
		
		sc.close();
	}
}

