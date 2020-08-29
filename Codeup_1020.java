import java.util.Scanner;

public class Codeup_1020 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 000907-1121112
		String s = sc.next(); // s = 000907-1121112
		String[] arr = s.split("-"); // arr[0] = 000907, arr[1] = 1121112
		int i = Integer.valueOf(arr[0]); // i = 000907
		int j = Integer.valueOf(arr[1]); // j = 1121112
		System.out.printf("%06d%07d",i,j); // 0009071121112
		
		sc.close();
	}

}

