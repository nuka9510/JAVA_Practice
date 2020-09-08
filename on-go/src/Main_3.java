import java.util.Scanner;

public class Main_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.println(i/500+(i%500)/100+((i%500)%100)/50+(((i%500)%100)%50)/10);
		
		sc.close();
	}

}