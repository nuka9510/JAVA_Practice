package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup_1218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		String result;
		num[0] = sc.nextInt();
		while(true) {
			num[1] = sc.nextInt();
			if(num[0]<=num[1]) {
				num[2] = sc.nextInt();
				if(num[1]<=num[2]) {
					break;
				}
			}
		}

		Arrays.sort(num);

		if(num[2]<num[0]+num[1]) {
			if(num[0]==num[1]|num[0]==num[2]|num[1]==num[2]) {
				result = "이등변삼각형";
				if(num[0]==num[1]&num[0]==num[2]) {
					result = "정삼각형";
				}
			}else if(Math.pow(num[0], 2)+Math.pow(num[1], 2)==Math.pow(num[2], 2)) { // Math class의 pow mathod는 제곱을 위한기능 이다.
				result = "직각삼각형";
			}else {
				result = "삼각형";
			}
		}else {
			result = "삼각형아님";
		}
		
		System.out.println(result);

		sc.close();
	}
}
