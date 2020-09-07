package CodeUp;

import java.util.Scanner;

public class Codeup_1124 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 입력될 값
		String s = sc.next(); // s = sc
		String[] narr1 = s.split("\\D"); // 스플릿\\D = 숫자를 제외한 모든 문자를 기준으로 문자열을 자른다.
		String[] sarr1 = s.split("\\d"); // 스플릿\\d = 숫자를 기준으로 문자열을 자른다.
		int[] narr2 = new int[narr1.length-1]; /* narr2[0]~narr2[narr1.length-1]변수 선언
												     화학식은 문자로 시작하므로 시작지점에서 문자열을 자를경우
												     첫 번째 배열에 공백이 입력된다.*/
		int[] sarr2 = new int[sarr1.length]; // sarr2[0]~sarr2[sarr1.length]변수 선언
		for(int i=0;i<narr2.length;i++) { // i = 0, i<narr2.length일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			narr2[i] = Integer.parseInt(narr1[i+1]); /* narr2[i] = narr1[i]
														Integer.parseInt를 사용하여
														문자열 값인 narr1를 정수값으로 변환해 준다.*/
		}
		for(int i=0;i<sarr2.length;i++) { // i = 0, i<sarr2.length일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			if(sarr1[i].charAt(0)=='C') { /* sarr1[i] = 'C'가 true일 경우 실행한다.
			 								 charAt()을 사용하여 문자열 값인 sarr1을 문자 값으로 변환해 준다. */
				sarr2[i] = 12; // sarr2[i] = 12
			}else if(sarr1[i].charAt(0)=='H') { /* sarr1[i] = 'C'가 false이고
			 									   sarr1[i] = 'H'가 true일 경우 실행한다.
			 									   charAt()을 사용하여 문자열 값인 sarr1을 문자 값으로 변환해 준다. */
				sarr2[i] = 1; // sarr2[i] = 1
			}
		}
		int[] arr = new int[narr2.length]; // arr[0]~arr[narr2.length]변수 선언
		int sum = 0; // sum = 0
		for(int i=0;i<narr2.length;i++) { // i = 0, i<narr2.length일 경우 반복 실행한다., 실행한 뒤 i에 1을 더한 값으로 초기화 한다.
			arr[i] = narr2[i]*sarr2[i]; // arr[i] = narr2[i]*sarr2[i]
			sum += arr[i]; // sum = sum + arr[i]
		}
		System.out.println(sum); // sum
		
		sc.close();
	}
}
