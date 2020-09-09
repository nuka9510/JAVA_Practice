import java.util.Scanner;

public class Main_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] way = new char[6];
		
		for(int i=0;i<6;i++) {
			way[i] = sc.next().charAt(0);
		}
		
		int x = 1;
		int y = 1;
		for(int w=0;w<6;w++) {
			if(y>=1&&y<5&&x>=1&&x<5) {
				if(way[w]=='R') {
					y++;
				}
				if(way[w]=='D') {
					x++;
				}
			}
			if(y>1&&y<=5&&x>1&&x<=5) {
				if(way[w]=='l') {
					y--;
				}
				if(way[w]=='U') {
					x--;
				}
			}
		}
		/*for(int w=0;w<6;w++) {
			if(way[w]=='R') {
				if(y>=1&&y<5) {
					y++;
				}
			}
			if(way[w]=='L') {
				if(y>1&&y<=5) {
					y--;
				}
			}
			if(way[w]=='U') {
				if(x>1&&x<=5) {
					x--;
				}
			}
			if(way[w]=='D') {
				if(x>=1&&x<5) {
					x++;
				}
			}
		}*/
		System.out.println("["+x+","+y+"]");
		
	sc.close();
	}
}