import java.util.Scanner;

public class Main_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] marr = s.split("-");
		int minsum = 0;
		for(int i=0;i<marr.length;i++) {
			String[] parr = marr[i].split("\\+");
			int sum = 0;
			for(String str:parr) {
				sum += Integer.parseInt(str);
			}
			if(i!=0) {
				sum*=-1;
			}
			minsum+=sum;
		}
		System.out.println(minsum);
		sc.close();
	}
}