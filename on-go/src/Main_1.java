public class Main_1 {
	public static void main(String[] args) {
		int[] num1 = new int[100];
		int[] num4 = new int[100];
		
		for(int i=0;i<6;i++) {
			if(i==0) {
				num1[i] = 1;
			}else if(i<3) {
				num1[i] = 2;
			}else {
				num1[i] = 3;
			}
		}
		for(int i=0;i<5;i++) {
			num4[i] = 4;
		}
		
		int rd;
		int swap;
		for(int i=0;i<num1.length;i++) {
			rd = (int)(Math.random()*num1.length);
			if(i!=rd) {
				swap = num1[i];
				num1[i] = num1[rd];
				num1[rd] = swap;
			}
		}
		for(int i=0;i<num4.length;i++) {
			rd = (int)(Math.random()*num4.length);
			if(i!=rd) {
				swap = num4[i];
				num4[i] = num4[rd];
				num4[rd] = swap;
			}
		}
		
		for(int i=0;i<num1.length;i++) {
			if(num1[i]==1) {
				System.out.printf("#1���� %d�� �ƺ��Դϴ�. �����մϴ�.\n", i+1);
			}
		}
		for(int i=0;i<num1.length;i++) {
			if(num1[i]==2) {
				System.out.printf("#2���� %d�� �������Դϴ�. �����մϴ�.\n", i+1);
			}
		}
		for(int i=0;i<num1.length;i++) {
			if(num1[i]==3) {
				System.out.printf("#3���� %d�� ��ȭ�� ��ǰ�� 3���Դϴ�. �����մϴ�.\n", i+1);
			}
		}
		for(int i=0;i<num4.length;i++) {
			if(num4[i]==4) {
				System.out.printf("#4���� %d�� �ýı��Դϴ�. �����մϴ�.\n", i+1);
			}
		}
	}

}
