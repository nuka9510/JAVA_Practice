import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float first = sc.nextFloat();
		
		if(first>37.5) {
			System.out.println("���� �����ϴ�. �µ��� �ٽ� ������ �ּ���.");
			float second = sc.nextFloat();	
			if(second>37.5) {
				System.out.println("������ �����մϴ�.");
			}else if(second<36) {
				System.out.println("��ü���Դϴ�.");
			}else {
				System.out.println("���ŵ� �����ϴ�.");
			}
		}else if(first<36) {
			System.out.println("��ü���Դϴ�.");
		}else {
			System.out.println("���ŵ� �����ϴ�.");
		}
		sc.close();
	}

}