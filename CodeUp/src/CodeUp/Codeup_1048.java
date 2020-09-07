package CodeUp;

import java.util.Scanner;

public class Codeup_1048 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		long l = sc.nextLong(); // l = sc = 1
		long m = sc.nextLong(); // m = sc = 3
		
		System.out.println(l<<m); /* 8, l<<m = 1<<3 = 8 
		 							 1<<3 = 
		 							 00000001(2진법) = 1
		 							 00001000(2진법) = 8
		 							 <<일 경우 왼쪽으로 m만큼 이동
		 							 >>일 경우 오른쪽으로 m만큼 이동(연산자 앞의 숫자가 양수일 경우 빈공간에 0이 채워짐)
		 													(연산자 앞의 숫자가 음수일 경우 빈공간에 1이 채워짐)
		 							 >>>일 경우 오른쪽으로 m만큼 이동(연산자 앞의 숫자와 관계 없이 빈공간에 0이 채워짐)*/
		
		sc.close();
		}
	}

