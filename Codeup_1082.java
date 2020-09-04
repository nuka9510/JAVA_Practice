package CodeUp;

import java.util.Scanner;

public class Codeup_1082 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = B
		
		int i = sc.nextInt(16); // i = sc = B(16진수)
		
		for(int j = 1;j<16;j++) { // j = 1, j<16가 true일 경우 반복 실행을 한다., 
			System.out.printf("%X*%X=%X\n", i, j, i*j); // %X는 16진수를 표현하는 서식문자이므로 16진수로 출력된다.
		}
	
		sc.close();
	}
}

