import java.util.Scanner;

public class Codeup_1025 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc = 75254
		String s = sc.next(); // s = 75254
		char[] arr = s.toCharArray(); /* arr[0] = 7, s.toCharArray() = {7, 5, 2, 5, 4};
		 								 arr[1] = 5
		 								 arr[2] = 2
		 								 arr[3] = 5
		 								 arr[4] = 4 */ 
		
		for(int i=0;i<arr.length;i++){ // i = 0, i<arr.length (i가 arr.length(5)보다 작을 때), i++를 한다.
			
			System.out.print("["+arr[i]); /* [arr[0]~arr[4], for문이 실행 종료할 때까지 [arr[]을 출력한다.
											 , println은 출력은 한 후 자동으로 줄 바꿈이 적용되므로 print를 사용해 줄이 바뀌지 않도록 한다. */
			
				for(int j=arr.length-1;j>i;j--){ // j = arr.length(5)-1 = 4, j>i (j가 i보다 클 때), j--를 한다.
					
					System.out.print("0"); // 0, for문이 실행 종료할 때까지 0을 출력한다.
				}
			
			System.out.println("]"); // ], 여기는 줄 바꿈이 적용돼야 하므로 println을 사용한다.
		
		}
		sc.close();
	}

}

