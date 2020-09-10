import java.util.Scanner;

public class Main_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l,p,v = 0;
		
		for(int cs = 1;true;cs++) {
			l = sc.nextInt();
			p = sc.nextInt();
			v = sc.nextInt();
			if(l==0&&p==0&&v==0) {
				break;
			}
			System.out.println("Case "+cs+": "+(v/p*l+Math.min(l, v%p)));
		}
		sc.close();
	}
}