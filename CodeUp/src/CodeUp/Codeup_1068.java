package CodeUp;

import java.util.Scanner;

public class Codeup_1068 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 75
		int i = sc.nextInt(); // i = sc = 75
		
		if(i>=90) // i>=90 = 75>=90 = false
			System.out.println("A"); // 조건문이 true일 경우 출력한다.
		else if(i>=70) // i>=70 = 75>=70 = true
			System.out.println("B"); // 상위 조건문이 false이고 조건문이 true일 경우 출력한다.
		else if(i>=40) // i>=40 = 75>=40 = true
			System.out.println("C"); // 상위 조건문이 false이고 조건문이 true일 경우 출력한다.
		else if(i>=0) // i>=0 = 75>=0 = true
			System.out.println("D"); // 상위 조건문이 false이고 조건문이 true일 경우 출력한다.
		else if(i<0)

		sc.close();
		}
	}

