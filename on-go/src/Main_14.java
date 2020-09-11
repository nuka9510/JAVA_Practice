import java.util.Arrays;
import java.util.Scanner;

public class Main_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String strs = s.replaceAll("[\\d]","");
		String ints = s.replaceAll("[^\\d]","");
		String[] strsarr = strs.split("");
		String[] intsarr = ints.split("");
		
		Arrays.sort(strsarr);
		
		int sum = 0;
		for(String num:intsarr) {
			sum += Integer.parseInt(num);
		}
		
		for(int i=0;i<strsarr.length;i++) {
			System.out.print(strsarr[i]);
		}
		System.out.println(sum);
		
		sc.close();
	}
}