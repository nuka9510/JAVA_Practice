package inflearn;

public class inflearn_10 { // Ŭ���� �̸�, ���ϸ��ϰ� ����, �Ϲ������δ� ù���ڸ� �빮�ڷ� ����Ѵ�, publicŬ���� �̹Ƿ� �ٸ� Ŭ�������� ȣ���� �����ϴ�.
	
	public String color; // color���� ����, ���ڿ� ������ ������, public���� �����Ͽ����Ƿ� �ٸ� Ŭ�������� ȣ�Ⱑ�� �ϴ�.
	public String gear; // gear���� ����
	public int price; // price���� ����, ������ ������ ������
	
	public inflearn_10() { // ������, Ŭ������ ȣ����� ��� �����Ѵ�.
		System.out.println("Grandeur constructor"); // Grandeur constructor
	}
	public void run() { // �޼���(���), Ŭ������ ȣ����� ��� ������ ����������., ���� �޼���� ȣ��� Ŭ�������� ����.run(); ���·� ��밡���ϴ�.
		System.out.println("--run--"); // --run--
	}
	public void stop() { // ����.stop(); ���·� ��� �����ϴ�.
		System.out.println("--stop--"); //--stop--
	}
	
	public void info() { // ���� �޼��� �ȿ� �ִ� ���๮�� ��� �����Ѵ�., ����.info(); ���·� ��� �����ϴ�.
		System.out.println("--info--"); // --info--
		System.out.println("color:"+color); // ����(color)�� ������ ��
		System.out.println("gear:"+gear); // ����(gear)�� ������ ��
		System.out.println("price:"+price); // ����(price)�� ������ ��
	}
}
