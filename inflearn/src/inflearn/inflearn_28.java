package inflearn;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class inflearn_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		ArrayList<String> list = null;
		
		int[] iArr = {0, 1, 2, 3, 4};
		
		try {
			i = sc.nextInt();
			j = sc.nextInt();
			
			System.out.println(i/j);
			
			for(int k=0;k<6;k++) {
				System.out.println(iArr[k]);
			}
			System.out.println(list.size());
		} catch(InputMismatchException e){
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}

}
