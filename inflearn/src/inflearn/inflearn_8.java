package inflearn;

import java.util.Scanner;

public class inflearn_8 {
	
	public static void main(String[] args) {
		//���ǹ�
		int num1 = 10; // num1 = 10
		int num2 = 20; // num2 = 20
		
		//if(���ǽ�)
		if(num1 < num2) { // true
			System.out.println("num1�� num2���� �۴�."); // num1�� num2���� �۴�., ���ǽ� ��� ���� true�̹Ƿ� ���� ����Ѵ�.
		}
		
		if(num1 > num2) { // false
			System.out.println("num1�� num2���� �۴�."); // ���ǽ� ��� ���� false�̹Ƿ� ���� ������� �ʴ´�.
		}
		
		System.out.println();
		
		//if(���ǽ�) else
		if(num1 < num2) { // true
			System.out.println("num1�� num2���� �۴�."); // num1�� num2���� �۴�., ���ǽ� ��� ���� true�̹Ƿ� ���� ����Ѵ�.
		} else {
			System.out.println("num1�� num2���� ũ�ų� ����."); // ���ǽ� ��� ���� true�̹Ƿ� ���� ������� �ʴ´�.
		}
		
		num1 = 20; // num1 = 20
		num2 = 10; // num2 = 10
		
		if(num1 < num2) { // false
			System.out.println("num1�� num2���� �۴�."); // ���ǽ� ���� false�̹Ƿ� ���� ������� �ʴ´�.
		} else {
			System.out.println("num1�� num2���� ũ�ų� ����."); // num1�� num2���� ũ�ų� ����., ���ǽ� ���� false�̹Ƿ� ���� ����Ѵ�.
		}
		
		System.out.println();
		
		//if(���ǽ�) else if(���ǽ�)
		num1 = 10; // num1 = 10
		num2 = 20; // num2 = 20
		
		if(num1 < num2) { // true
			System.out.println("num1�� num2���� �۴�."); // num1�� num2���� �۴�., ���ǽ� ���� true�̹Ƿ� ���� ����Ѵ�., ���� ��������Ƿ� ���� ���ǽ��� ������� �ʴ´�.
		} else if(num1 > num2){ // false
			System.out.println("num1�� num2���� ũ��."); // ���ǽ� ���� false�̹Ƿ� ���� ������� �ʴ´�.
		} else {
			System.out.println("num1�� num2�� ����."); // ���ǽ� ���� false������ ���� ���ǽ� ���� ��� �Ǿ����Ƿ� ���� ������� �ʴ´�.
		}
		
		num1 = 20; // num1 = 20
		num2 = 10; // num2 = 10
		
		if(num1 < num2) { // false
			System.out.println("num1�� num2���� �۴�."); // ���ǽ� ���� false�̹Ƿ� ���� ������� �ʴ´�.
		} else if(num1 > num2){ // true
			System.out.println("num1�� num2���� ũ��."); // num1�� num2���� ũ��., ���ǽ� ���� true�̹Ƿ� ���� ����Ѵ�.
		} else {
			System.out.println("num1�� num2�� ����."); // ���� true�̹Ƿ� ���� ������� �ʴ´�.
		}
		
		num1 = 10; // num1 = 10
		num2 = 10; // num2 = 10
		
		if(num1 < num2) { // false
			System.out.println("num1�� num2���� �۴�."); // ���ǽ� ���� false�̹Ƿ� ���� ������� �ʴ´�.
		} else if(num1 > num2){ // false
			System.out.println("num1�� num2���� ũ��."); // ���ǽ� ���� false�̹Ƿ� ���� ������� �ʴ´�.
		} else {
			System.out.println("num1�� num2�� ����."); // num1�� num2�� ����., ���ǽ��� false�̹Ƿ� ���� ����Ѵ�.
		}
		
		System.out.println();
		
		//switch��
		System.out.print("������ �Է��ϼ���.:"); // ������ �Է��ϼ���.:
		Scanner sc = new Scanner(System.in); // sc = �Է��� ��
		int score = sc.nextInt(); // score = sc = �Է��� ��, �Է�â���� ��µ�
		
		switch (score) {
		    case 100:
			case 90:
				System.out.println("��"); // score�� �Է��� ���� 100, 90�� ��� ����Ѵ�.
			break; // ���๮�� ������ �Ͽ��� ��� ������ ���๮�� �������� �ʴ´�.
			
			case 80:
				System.out.println("��"); // score�� �Է��� ���� 80�� ��� ����Ѵ�.
			break;
			
			case 70:
				System.out.println("��"); // score�� �Է��� ���� 70�� ��� ����Ѵ�.
			break;
			
			default:
				System.out.println("try again!!"); // case�� ������ ���� �ƴҰ�� ����Ѵ�.
			break;
		}
		
		sc.close();
		
	}

}
