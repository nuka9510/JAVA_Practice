package CodeUp;

import java.util.Scanner;

public class Codeup_1026 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값 = 17:23:57
		String s = sc.next(); // s = sc =17:23:57
		String[] arr = s.split("\\:"); /* arr[0] = 17
		 								  arr[1] = 23
		 								  arr[2] = 57 */
		int i = Integer.parseInt(arr[1]); // i = arr[1] = 23, integer.parseInt를 사용하여 문자열변수(arr[1])를 정수형변수(i)로 변환함
				
		System.out.println(i); // 변수(i)를 출력한다.
		
		sc.close();
		}
	}
