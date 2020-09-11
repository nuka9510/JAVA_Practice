import java.util.Scanner;

public class Main_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nstr = sc.next();
		String[] narr = nstr.split("");
		int[] nfirst = new int[narr.length/2];
		int[] nsecond = new int[narr.length/2];
		
		for(int i=0;i<narr.length/2;i++) {
			nfirst[i] = Integer.parseInt(narr[i]);
			nsecond[i] = Integer.parseInt(narr[i+narr.length/2]);
		}
		
		int sumfirst = 0;
		int sumsecond = 0;
		for(int i=0;i<narr.length/2;i++) {
			sumfirst += nfirst[i];
			sumsecond += nsecond[i];
		}
		
		if(sumfirst==sumsecond) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
		
		sc.close();
	}
}