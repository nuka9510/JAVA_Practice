import java.util.Scanner;

public class Main_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sarr = s.split("");
		int[] num = new int[sarr.length];
		
		for(int i=0;i<sarr.length;i++) {
			num[i] = Integer.parseInt(sarr[i]);
		}
		
		int total = 0;
		for(int i=0;i<num.length;i++) {
			if(total+num[i]<total*num[i]) {
				total*=num[i];
			}else {
				total+=num[i];
			}
		}
		System.out.println(total);
		
	sc.close();
	}
}