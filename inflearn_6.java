package pjtTest;

import java.util.Scanner;

public class inflearn_6 {
	
	public static void main(String[] args) {
		
		//�迭 ���� �� �ʱ�ȭ
		int[] arr1 = new int[5]; // arr1[0]~arr[4]�迭 ����
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
		
		//�迭 ����� �ʱ�ȭ�� ���ÿ�
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
		
		//�迭�� �̿��� �л����
		String[] name = {"����ȣ", "�̽¿�", "�ں�ȣ", "�̺���", "������"}; /* name[0] = ����ȣ
																	   name[1] = �̽¿�
																	   name[2] = �ں�ȣ
																	   name[3] = �̺���
		 															   name[4] = ������  */ 
		int[] score = new int[5]; // score[0]~score[4]�迭 ����
		Scanner scanner = new Scanner(System.in); // scanner = �Է��� ��
		System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[0]); // ����ȣ�� ������ �Է��Ͻÿ�.:
		score[0] = scanner.nextInt(); // score[0] = �Է��� ��, �Է� â���� ��µ�
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[1]); // �̽¿��� ������ �Է��Ͻÿ�.:
		score[1] = scanner.nextInt(); // score[1] = �Է��� ��

		System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[2]); // �ں�ȣ�� ������ �Է��Ͻÿ�.:
		score[2] = scanner.nextInt(); // score[2] = �Է��� ��
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[3]); // �̺����� ������ �Է��Ͻÿ�.:
		score[3] = scanner.nextInt(); // score[3] = �Է��� ��
		
		System.out.printf("%s�� ������ �Է��Ͻÿ�.:",name[4]); // �������� ������ �Է��Ͻÿ�.:
		score[4] = scanner.nextInt(); // score[4] = �Է��� ��
		
		System.out.printf("%s�� ����:\t%.2f\n",name[0],(double)score[0]); // ����ȣ�� ����:	�Էµ� ��(0.00)
		System.out.printf("%s�� ����:\t%.2f\n",name[1],(double)score[1]); // �̽¿��� ����:	�Էµ� ��(0.00)
		System.out.printf("%s�� ����:\t%.2f\n",name[2],(double)score[2]); // �ں�ȣ�� ����:	�Էµ� ��(0.00)
		System.out.printf("%s�� ����:\t%.2f\n",name[3],(double)score[3]); // �̺����� ����:	�Էµ� ��(0.00)
		System.out.printf("%s�� ����:\t%.2f\n",name[4],(double)score[4]); // �������� ����:	�Էµ� ��(0.00)
		
		double ave = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/5; // ave = score[0]~score[4]�� ��/5
		System.out.printf("-----------------------\n����:\t%.2f",ave); /* -----------------------
		 																 ����:	����(ave)��(0.00)*/
		
		scanner.close();
	}

}
