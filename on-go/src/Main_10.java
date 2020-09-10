import java.util.Scanner;

public class Main_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] button = {300,60,10};
		int[] bt = new int[button.length];
		
		for(int i=0;i<button.length;i++) {
			if(t%10==0) {
				bt[i] = t/button[i];
				t %= button[i];
				System.out.print(bt[i]+" ");
			}else {
				System.out.println(-1);
				break;
			}
		}
		
	sc.close();
	}
}