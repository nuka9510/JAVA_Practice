package inflearn;

public class inflearn_14 {
	
	public String name; // ����(name) ����, ���ڿ� ������ ����
	public String gender; // ����(gender) ����, ���ڿ� ������ ����
	public int age; // ����(age) ����, ������ ������ ����
	
	public inflearn_14() { // ������
		System.out.println("--ChildClass constructor--"); // --ChildClass constructor--
	}
	
	public void setInfo(String n,String g,int a) { // �޼���, ����.setInfo(String n,String g,int a);���·� ��밡��, ��ȣ�ȿ� ���� �Է��ϸ� �ش� ������ �����ȴ�.
		System.out.println("--setInfo() START--"); // --setInfo() START--
		name = n; // name = n, �޼��� ���� ����
		gender = g; // gender = g, �޼��� ���� ����
		age = a; // age = a, �޼��� ���� ����
	}
	
	public void getInfo() { // �޼���, ����.getInfo();���·� ��밡��
		System.out.println("--getInfo() START--"); // --getInfo() START--
		
		System.out.println("name:"+name); // ����(name)�� ������ ��
		System.out.println("gender:"+gender); // ����(gender)�� ������ ��
		System.out.println("age:"+age); //����(age)�� ������ ��
	}
	
	private void mySecret() { // �޼���, ����.mySecret();���·� ��밡��, private�޼��� �̹Ƿ� �ٸ� Ŭ���������� ����� �Ұ��� �ϴ�.
		System.out.println("--mySecret()--"); // --mySecret--
	}

}
