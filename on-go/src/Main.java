import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float first = sc.nextFloat();
		
		if(first>37.5) {
			System.out.println("들어갈수 없습니다. 온도를 다시 측정해 주세요.");
			float second = sc.nextFloat();	
			if(second>37.5) {
				System.out.println("병원에 가야합니다.");
			}else if(second<36) {
				System.out.println("저체온입니다.");
			}else {
				System.out.println("들어가셔도 좋습니다.");
			}
		}else if(first<36) {
			System.out.println("저체온입니다.");
		}else {
			System.out.println("들어가셔도 좋습니다.");
		}
		sc.close();
	}

}