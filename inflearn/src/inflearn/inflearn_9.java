package inflearn;

import java.util.Scanner;

public class inflearn_9 {
	
	public static void main(String[] args) {
		//for��
		System.out.print("INPUT NUMBER:"); // INPUT NUMBER:
		Scanner sc = new Scanner(System.in); // sc = �Է��� ��
		int inputnum = sc.nextInt(); // inputnum = sc = �Է��� ��, �Է�â���� ��µ�
		
		for(int i=1;i<10;i++) { // i = 1, i�� 10���� ���� ��, i++�� �Ѵ�.
			System.out.printf("%d*%d=%d\n", inputnum, i, (inputnum*i)); // ����(inputnum)*����(i)=(inputnum*i)
		}
		
		System.out.println();
		
		//while��
		System.out.print("INPUT NUMBER:"); // INPUT NUMBER:
		int num = sc.nextInt(); // num = sc = �Է��� ��, �Է�â���� ��µ�
		int i = 1; // i = 1
		while (i<10) { // i�� 10���� ���� ��
			System.out.printf("%d*%d=%d\n",num,i,(num*i)); // ����(num)*����(i)=(num*i)
			i++; // i++�� �Ѵ�.
		}
		
		System.out.println();
		
		//do ~ while��
		do {
			System.out.println("������ 1���� �����մϴ�."); // ������ 1���� �����մϴ�.
		} while(false); // false�̹Ƿ� ���๮�� �ٽ� �������� �ʴ´�., true�� ��� ���๮�� �ٽ� �����Ѵ�.
		
		sc.close();
	}

}
