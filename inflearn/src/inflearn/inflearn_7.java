package inflearn;

import java.util.Arrays;

public class inflearn_7 {
	
	public static void main(String[] args) {
		//배열 기본 속성
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60}; /* arrAtt1[0] = 10
		 											 arrAtt1[1] = 20
		 											 arrAtt1[2] = 30
		 											 arrAtt1[3] = 40
		 											 arrAtt1[4] = 50
		 											 arrAtt1[5] = 60 */
		int[] arrAtt2 = null; // arrAtt2 배열 선언(배열 값은 지정 안 됨)
		int[] arrAtt3 = null; // arrAtt3 배열 선언
		
		//배열 길이
		System.out.println("arrAtt1.length:"+arrAtt1.length); // arrAtt1.length:6, .length는 배열의 길이 값을 출력한다.
		
		//배열 요소 출력
		System.out.println("arrAtt1:"+Arrays.toString(arrAtt1)); // arrAtt1:[10, 20, 30, 40, 50, 60], Arrays.toString(배열)는 배열 안의 값을 대괄호[] 안에 모두 출력한다.
		
		//배열 요소 복사
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length); // arrAtt3 = arrAtt1(arrAtt1.length = 6), Arrays.copyOf(복사 할 배열, 배열 길이 값), 지정한 배열을 배열 길이 값 만큼 복사 한다.
		System.out.println("arrAtt3:"+Arrays.toString(arrAtt3)); // arrAtt3:[10, 20, 30, 40, 50, 60]
		
		//배열 레퍼런스(주소)
		arrAtt2 = arrAtt1; // arrAtt2 = arrAtt1
		System.out.println("arrAtt1:"+arrAtt1); // arrAtt1:arrAtt1의 주소 값, 배열 이름만 지정했을 경우 배열의 주소 값을 출력한다.
		System.out.println("arrAtt2:"+arrAtt2); // arrAtt2:arrAtt2(arrAtt1)의 주소 값
		System.out.println("arrAtt3:"+arrAtt3); // arrAtt3:arrAtt3의 주소 값
		
		//다차원 배열
		int[][] arrMul = new int[3][2]; /* arrMul[0][0]~arrMul[2][1] 배열 선언
		
		 								   arrMul[0][0]arrMul[0][1]
		 								   arrMul[1][0]arrMul[1][1]
		 								   arrMul[2][0]arrMul[2][1] 
		 								   							*/
		arrMul[0][0]=10; // arrMul[0][0] = 10
		arrMul[0][1]=100; // arrMul[0][1] = 100
		arrMul[1][0]=20; // arrMul[1][0] = 20
		arrMul[1][1]=200; // arrMul[1][1] = 200
		arrMul[2][0]=30; // arrMul[2][0] = 30
		arrMul[2][1]=300; // arrMul[2][1] = 300
		
		System.out.println("arrMul[0]:"+Arrays.toString(arrMul[0])); // arrMul[0]:[10, 100]
		System.out.println("arrMul[1]:"+Arrays.toString(arrMul[1])); // arrMul[1]:[20, 200]
		System.out.println("arrMul[2]:"+Arrays.toString(arrMul[2])); // arrMul[2]:[30, 300]
	}

}
