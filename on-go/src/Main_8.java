import java.util.Arrays;
import java.util.Scanner;

public class Main_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		
		for(int i=0;i<p.length;i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		
		int psum = 0;
		for(int i=0;i<p.length;i++) {
			psum += p[i]*n;
			n--;
		}
		
		System.out.println(psum);
		
	sc.close();
	}
}