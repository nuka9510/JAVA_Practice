import java.util.Scanner;

public class Codeup_1024 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = Boy
		String s = sc.next(); // s = Boy
		int len = s.length(); // len = s.length (s의 길이) = 3
		for(int i=0;i<len;i++) // i = 0, i<len (i가 len보다 작을 때), i++를 한다 
							  {
			System.out.printf("\'%c\'\n",s.charAt(i)); // %c = 문자 = s.charAt(i), charAt(i) = i+1번째의 문자
														/* 'B'
														   'o'
														   'y' */
		}
		sc.close();
	}

}

