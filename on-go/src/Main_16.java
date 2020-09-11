import java.util.Scanner;

public class Main_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i=0;i<tc;i++) {
			int tn = sc.nextInt();
			int[] score = new int[tn];
			
			for(int j=0;j<tn;j++) {
				int dscore = sc.nextInt()-1;
				int iscore = sc.nextInt();
				score[dscore] = iscore;
			}
			
			int x = score[0];
			int count = 1;
			for(int j=1;j<tn;j++) {
				if(x>score[j]) {
					count+=1;
					x = score[j];
				}
			}
			
			System.out.println(count);
		}
		sc.close();
	}
}