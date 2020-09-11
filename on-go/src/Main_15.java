import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i=0;i<tc;i++) {
			int tn = sc.nextInt();
			int[][] score = new int[tn][2];
			
			for(int j=0;j<tn;j++) {
				for(int k=0;k<2;k++) {
					score[j][k] = sc.nextInt();
				}
			}
			
			Arrays.sort(score, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			
			int x = 0;
			int count = 1;
			for(int j=1;j<tn;j++) {
				if(score[x][1]>score[j][1]) {
					count+=1;
					x = j;
				}
			}
			
			System.out.println(count);
		}
		sc.close();
	}
}