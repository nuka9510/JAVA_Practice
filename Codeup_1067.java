package CodeUp;

import java.util.Scanner;

public class Codeup_1067 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = -2147483648
		int i = sc.nextInt(); // i = sc = -2147483648
		
		if(i>0) // i>0 = -2147483648>0 = false
			System.out.println("plus"); // 조건문이 true일 경우 출력한다.
		else if(i<0) // i<0 = -2147483648<0 = true
			System.out.println("minus"); // 상위 조건문이 false이고 하위 조건문이 true일 경우 출력한다.
		if(i%2==0) // i%2==0 = -2147483648%2==0 = true
			System.out.println("even"); // 조건문이 true일 경우 출력한다.
		else
			System.out.println("odd"); // 조건문이 false일 경우 출력한다.

		sc.close();
		}
	}

