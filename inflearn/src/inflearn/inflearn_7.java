package inflearn;

import java.util.Arrays;

public class inflearn_7 {
	
	public static void main(String[] args) {
		//�迭 �⺻ �Ӽ�
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60}; /* arrAtt1[0] = 10
		 											 arrAtt1[1] = 20
		 											 arrAtt1[2] = 30
		 											 arrAtt1[3] = 40
		 											 arrAtt1[4] = 50
		 											 arrAtt1[5] = 60 */
		int[] arrAtt2 = null; // arrAtt2 �迭 ����(�迭 ���� ���� �� ��)
		int[] arrAtt3 = null; // arrAtt3 �迭 ����
		
		//�迭 ����
		System.out.println("arrAtt1.length:"+arrAtt1.length); // arrAtt1.length:6, .length�� �迭�� ���� ���� ����Ѵ�.
		
		//�迭 ��� ���
		System.out.println("arrAtt1:"+Arrays.toString(arrAtt1)); // arrAtt1:[10, 20, 30, 40, 50, 60], Arrays.toString(�迭)�� �迭 ���� ���� ���ȣ[] �ȿ� ��� ����Ѵ�.
		
		//�迭 ��� ����
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length); // arrAtt3 = arrAtt1(arrAtt1.length = 6), Arrays.copyOf(���� �� �迭, �迭 ���� ��), ������ �迭�� �迭 ���� �� ��ŭ ���� �Ѵ�.
		System.out.println("arrAtt3:"+Arrays.toString(arrAtt3)); // arrAtt3:[10, 20, 30, 40, 50, 60]
		
		//�迭 ���۷���(�ּ�)
		arrAtt2 = arrAtt1; // arrAtt2 = arrAtt1
		System.out.println("arrAtt1:"+arrAtt1); // arrAtt1:arrAtt1�� �ּ� ��, �迭 �̸��� �������� ��� �迭�� �ּ� ���� ����Ѵ�.
		System.out.println("arrAtt2:"+arrAtt2); // arrAtt2:arrAtt2(arrAtt1)�� �ּ� ��
		System.out.println("arrAtt3:"+arrAtt3); // arrAtt3:arrAtt3�� �ּ� ��
		
		//������ �迭
		int[][] arrMul = new int[3][2]; /* arrMul[0][0]~arrMul[2][1] �迭 ����
		
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
