package pjtTest;

public class inflearn_3 {
	
	public static void main(String[] args) {
		
		//�⺻ �ڷ���		
		char c = 'c'; // ������ 2byte, c = c
		System.out.println("c="+c); // c
		
		int i = 10; // ������ 4byte, i = 10
		System.out.println("i="+i); // 10
				
		double d = 10.123; // �Ǽ��� 8byte, d = 10.123
		System.out.println("d="+d); // 10.123
		
		boolean b = false; // ����(��, ����) 1byte, b = false
		System.out.println("b="+b); // false
		
		String s = "Hello Java World!!!!!!"; // ���ڿ�, s = Hello Java World!!!!!!
		System.out.println("s="+s); // Hello Java World!!!!!!
		
		System.out.println();
		
		//�ڵ�(������) �� ��ȯ
		//���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
		byte by = 10; // ������ 1byte, by = 10
		int in = by; // in = by = 10
		System.out.println("in="+in); // 10
		
		//����� �� ��ȯ
		//ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
		int iVar = 100; // iVar = 100
		byte bVar = (byte)iVar; // bVar = iVar = 100, ����� �� ��ȯ������ ��ȯ �� �ڷ����� ���
		System.out.println("bVar="+bVar); // 100
		
		iVar = 123456; // iVar���� �ʱ�ȭ, iVar = 123456
		bVar = (byte)iVar; // bVar���� �ʱ�ȭ, bVar = iVar = 123456 �㳪 byte�� �޸𸮰����� ���� ���� �� ��
		System.out.println("bVar="+bVar); // 64, byte�� �޸𸮰������δ� 123456�� ���� ���� �� �Ͽ� ��ȯ�� ��
	}

}
