package inflearn;

public class inflearn_4 {
	
	public static void main(String[] args) {
		
		//�ּ�
		/*
		 * �ּ�
		 */
		
		//Ư�� ����
		System.out.println("Good\tMorning"); // Good	Morning, \t(��)
		System.out.println("Good\nMorning"); /* Good
		 										Morning, \n(�� �ٲ�) */
		System.out.println("Good\'Morning\'"); // Good'Morning',  \'(���� ����ǥ)
		System.out.println("Good\"Morning\""); // Good"Morning", \"(ū ����ǥ)
		System.out.println("Good\\Morning\\"); // Good\Morning\, \\(�� ������)
		
		System.out.println();
		
		//���Ĺ���
		System.out.println("������ ����� 10�� �Դϴ�."); // ������ ����� 10�� �Դϴ�.
		System.out.printf("������ ����� %d�� �Դϴ�.\n",10); // ������ ����� 10�� �Դϴ�., %d(10����)
		
		int num1 = 20; // num1 = 20
		System.out.println("������ ����� "+num1+"�� �Դϴ�."); // ������ ����� 20 �� �Դϴ�., num1 = 20
		System.out.printf("������ ����� %d�� �Դϴ�.\n",num1); // ������ ����� 20 �� �Դϴ�., num1 = 20
		
		System.out.printf("ȫ�浿's Info. : %d�г� %d�� %d��\n",6,2,10); // ȫ�浿's Info. : 6�г�2��10��
		
		System.out.println();
		
		//����
		int num2 = 30; // num2 = 30
		System.out.printf("num2(10����) : %d\n",num2); // 30
		System.out.printf("num2(8����) : %o\n",num2); // 36, %o(8����)
		System.out.printf("num2(16����) : %x\n",num2); // 1e, %x(16����)
		
		System.out.println();
		
		//����
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n",'a','A'); // �ҹ���'a'�� �빮�ڴ� 'A'�Դϴ�., %c(����)
		
		System.out.println();
		
		//���ڿ�
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n","java","JAVA"); // 'java'�� �빮�ڷ� �ٲٸ�'JAVA'�Դϴ�., %s(���ڿ�)
		
		System.out.println();
		
		//�Ǽ�
		float f = 1.23f; // �Ǽ��� 4byte, f = 1.23, float�� ���� �ʱ�ȭ �� �ڿ� f�� �ݵ�� �ٿ��� �Ѵ�.
		System.out.printf("f=%f\n",f); // 1.230000, %f(�Ǽ�), �Ҽ��� ������ ������ �Ҽ��� �Ʒ� 6��° �ڸ����� ��µ�
		
		double d = 1.23456; // d = 1.123456
		System.out.printf("d=%f\n",d); // 1.234560, �Ҽ��� ������ ������ �Ҽ��� �Ʒ� 6��° �ڸ����� ��µ�
		
		System.out.println();
		
		//���Ĺ��� ���� ���
		System.out.printf("%d\n",123); // 123
		System.out.printf("%d\n",1234); // 1234
		System.out.printf("%d\n",12345); // 12345
		
		System.out.println();
		
		System.out.printf("%5d\n",123); // **123, *�� �������, %d�� ���� ��(����)�� �־��� �� ���� �� ��ġ�� �������� ��µ�
		System.out.printf("%5d\n",1234); // *1234, *�� �������
		System.out.printf("%5d\n",12345); // 12345
		
		System.out.println();
		
		//���Ĺ��� �Ҽ������� ���
		System.out.printf("%f\n",1.23); // 1.230000
		System.out.printf("%.0f\n",1.23); // 1, %f�� �Է��� �Ҽ��� ���� �� ��ŭ ��µ�
		System.out.printf("%.1f\n",1.23); // 1.2
		System.out.printf("%.2f\n",1.23); // 1.23
		System.out.printf("%.3f\n",1.23); // 1.230
	}

}
