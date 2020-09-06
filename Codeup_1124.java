package CodeUp;

import java.util.Scanner;

public class Codeup_1124 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = �Էµ� ��
		String s = sc.next(); // s = sc
		String[] narr1 = s.split("\\D"); // ���ø�\\D = ���ڸ� ������ ��� ���ڸ� �������� ���ڿ��� �ڸ���.
		String[] sarr1 = s.split("\\d"); // ���ø�\\d = ���ڸ� �������� ���ڿ��� �ڸ���.
		int[] narr2 = new int[narr1.length-1]; /* narr2[0]~narr2[narr1.length-1]���� ����
												     ȭ�н��� ���ڷ� �����ϹǷ� ������������ ���ڿ��� �ڸ����
												     ù ��° �迭�� ������ �Էµȴ�.*/
		int[] sarr2 = new int[sarr1.length]; // sarr2[0]~sarr2[sarr1.length]���� ����
		for(int i=0;i<narr2.length;i++) { // i = 0, i<narr2.length�� ��� �ݺ� �����Ѵ�., ������ �� i�� 1�� ���� ������ �ʱ�ȭ �Ѵ�.
			narr2[i] = Integer.parseInt(narr1[i+1]); /* narr2[i] = narr1[i]
														Integer.parseInt�� ����Ͽ�
														���ڿ� ���� narr1�� ���������� ��ȯ�� �ش�.*/
		}
		for(int i=0;i<sarr2.length;i++) { // i = 0, i<sarr2.length�� ��� �ݺ� �����Ѵ�., ������ �� i�� 1�� ���� ������ �ʱ�ȭ �Ѵ�.
			if(sarr1[i].charAt(0)=='C') { /* sarr1[i] = 'C'�� true�� ��� �����Ѵ�.
			 								 charAt()�� ����Ͽ� ���ڿ� ���� sarr1�� ���� ������ ��ȯ�� �ش�. */
				sarr2[i] = 12; // sarr2[i] = 12
			}else if(sarr1[i].charAt(0)=='H') { /* sarr1[i] = 'C'�� false�̰�
			 									   sarr1[i] = 'H'�� true�� ��� �����Ѵ�.
			 									   charAt()�� ����Ͽ� ���ڿ� ���� sarr1�� ���� ������ ��ȯ�� �ش�. */
				sarr2[i] = 1; // sarr2[i] = 1
			}
		}
		int[] arr = new int[narr2.length]; // arr[0]~arr[narr2.length]���� ����
		int sum = 0; // sum = 0
		for(int i=0;i<narr2.length;i++) { // i = 0, i<narr2.length�� ��� �ݺ� �����Ѵ�., ������ �� i�� 1�� ���� ������ �ʱ�ȭ �Ѵ�.
			arr[i] = narr2[i]*sarr2[i]; // arr[i] = narr2[i]*sarr2[i]
			sum += arr[i]; // sum = sum + arr[i]
		}
		System.out.println(sum); // sum
		
		sc.close();
	}
}
