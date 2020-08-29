import java.util.Scanner;

public class Codeup_1019 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 2013.8.5
		String s = sc.next(); // s = 2013.8.5
		String[] arr = s.split("\\."); // arr[0] = 2013, arr[1] = 8, arr[2] = 5
		int i = Integer.valueOf(arr[0]); // i = arr[0] = 2013
		int j = Integer.valueOf(arr[1]); // j = arr[1] = 8
		int k = Integer.valueOf(arr[2]); // k = arr[2] = 5
		System.out.printf("%04d.%02d.%02d",i,j,k); // 2013.08.05
		
		sc.close();
	}

}

