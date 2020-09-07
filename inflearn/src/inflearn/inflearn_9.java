package inflearn;

import java.util.Scanner;

public class inflearn_9 {
	
	public static void main(String[] args) {
		//for문
		System.out.print("INPUT NUMBER:"); // INPUT NUMBER:
		Scanner sc = new Scanner(System.in); // sc = 입력할 값
		int inputnum = sc.nextInt(); // inputnum = sc = 입력할 값, 입력창으로 출력됨
		
		for(int i=1;i<10;i++) { // i = 1, i가 10보다 작을 때, i++를 한다.
			System.out.printf("%d*%d=%d\n", inputnum, i, (inputnum*i)); // 변수(inputnum)*변수(i)=(inputnum*i)
		}
		
		System.out.println();
		
		//while문
		System.out.print("INPUT NUMBER:"); // INPUT NUMBER:
		int num = sc.nextInt(); // num = sc = 입력할 값, 입력창으로 출력됨
		int i = 1; // i = 1
		while (i<10) { // i가 10보다 작을 때
			System.out.printf("%d*%d=%d\n",num,i,(num*i)); // 변수(num)*변수(i)=(num*i)
			i++; // i++를 한다.
		}
		
		System.out.println();
		
		//do ~ while문
		do {
			System.out.println("무조건 1번은 실행합니다."); // 무조건 1번은 실행합니다.
		} while(false); // false이므로 실행문을 다시 실행하지 않는다., true일 경우 샐행문을 다시 실행한다.
		
		sc.close();
	}

}
