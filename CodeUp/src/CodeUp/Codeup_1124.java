package CodeUp;

import java.util.Scanner;

public class Codeup_1124 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] sarr = input.replaceAll("\\d", "").split("");
		String[] narr = input.replaceAll("\\D", "/").split("/");
		int result = 0;


		for(int i=0;i<sarr.length;i++) {
			result += ((sarr[i].equals("C"))?12:1)*Integer.parseInt(narr[i+1]);
		}

		System.out.println(result);

		sc.close();
	}
}

