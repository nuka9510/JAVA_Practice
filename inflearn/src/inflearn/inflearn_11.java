package inflearn;

public class inflearn_11 { // Ŭ���� �̸�

	public String color; // color��������, ���ڿ� ������ ������
	public int price; // price��������, ������ ������ ������
	
	public inflearn_11() { // ������
		System.out.println("Bicycle constructor-1"); // Bicycle constructor-1
	}
	public inflearn_11(String c,int p) { // ������, ��ȣ�ȿ� ���� �Է��ϸ� �ش� ������ �����ȴ�.
		System.out.println("Bicycle constructor-2"); // Bicycle constructor-2
		color = c; // color = c, ������ ���� ����
		price = p; // price = p, ������ ���� ����
	}
	public void info() { // �޼���, ����.info();���·� ��� �����ϴ�.
		System.out.println("--info--"); //--info--
		System.out.println("color:"+color); // ����(color)�� ������ ��
		System.out.println("price:"+price); // ����(price)�� ������ ��
	}
}
