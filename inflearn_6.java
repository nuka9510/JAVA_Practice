package pjtTest;

import java.util.Scanner;

public class inflearn_6 {
	
	public static void main(String[] args) {
		
		//배열 선언 후 초기화
		int[] arr1 = new int[5]; // arr1[0]~arr[4]배열 선언
		arr1[0] = 100; // arr1[0] = 100
		arr1[1] = 200; // arr1[1] = 200
		arr1[2] = 300; // arr1[2] = 300
		arr1[3] = 400; // arr1[3] = 400
		arr1[4] = 500; // arr1[4] = 500
		
		System.out.println("arr1[0]="+arr1[0]); // arr1[0]=100
		System.out.println("arr1[1]="+arr1[1]); // arr1[1]=200
		System.out.println("arr1[2]="+arr1[2]); // arr1[2]=300
		System.out.println("arr1[3]="+arr1[3]); // arr1[3]=400
		System.out.println("arr1[4]="+arr1[4]); // arr1[4]=500
		
		System.out.println();
		
		//배열 선언과 초기화를 동시에
		int[] arr2 = {10, 20, 30, 40, 50}; /* arr2[0] = 10
											  arr2[1] = 20
											  arr2[2] = 30
											  arr2[3] = 40
		 									  arr2[4] = 50 */
		System.out.println("arr2[0]="+arr2[0]); // arr2[0]=10
		System.out.println("arr2[1]="+arr2[1]); // arr2[1]=20
		System.out.println("arr2[2]="+arr2[2]); // arr2[2]=30
		System.out.println("arr2[3]="+arr2[3]); // arr2[3]=40
		System.out.println("arr2[4]="+arr2[4]); // arr2[4]=50
		
		System.out.println();
		
		//배열을 이용한 학사관리
		String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"}; /* name[0] = 박찬호
																	   name[1] = 이승엽
																	   name[2] = 박병호
																	   name[3] = 이병규
		 															   name[4] = 류현진  */ 
		int[] score = new int[5]; // score[0]~score[4]배열 선언
		Scanner scanner = new Scanner(System.in); // scanner = 입력할 값
		System.out.printf("%s의 점수를 입력하시오.:",name[0]); // 박찬호의 점수를 입력하시오.:
		score[0] = scanner.nextInt(); // score[0] = 입력할 값, 입력 창으로 출력됨
		
		System.out.printf("%s의 점수를 입력하시오.:",name[1]); // 이승엽의 점수를 입력하시오.:
		score[1] = scanner.nextInt(); // score[1] = 입력할 값

		System.out.printf("%s의 점수를 입력하시오.:",name[2]); // 박병호의 점수를 입력하시오.:
		score[2] = scanner.nextInt(); // score[2] = 입력할 값
		
		System.out.printf("%s의 점수를 입력하시오.:",name[3]); // 이병규의 점수를 입력하시오.:
		score[3] = scanner.nextInt(); // score[3] = 입력할 값
		
		System.out.printf("%s의 점수를 입력하시오.:",name[4]); // 류현진의 점수를 입력하시오.:
		score[4] = scanner.nextInt(); // score[4] = 입력할 값
		
		System.out.printf("%s의 점수:\t%.2f\n",name[0],(double)score[0]); // 박찬호의 점수:	입력된 값(0.00)
		System.out.printf("%s의 점수:\t%.2f\n",name[1],(double)score[1]); // 이승엽의 점수:	입력된 값(0.00)
		System.out.printf("%s의 점수:\t%.2f\n",name[2],(double)score[2]); // 박병호의 점수:	입력된 값(0.00)
		System.out.printf("%s의 점수:\t%.2f\n",name[3],(double)score[3]); // 이병규의 점수:	입력된 값(0.00)
		System.out.printf("%s의 점수:\t%.2f\n",name[4],(double)score[4]); // 류현진의 점수:	입력된 값(0.00)
		
		double ave = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/5; // ave = score[0]~score[4]의 합/5
		System.out.printf("-----------------------\n평점:\t%.2f",ave); /* -----------------------
		 																 평점:	변수(ave)값(0.00)*/
		
		scanner.close();
	}

}
