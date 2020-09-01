package inflearn;

public class inflearn_11 {

	public String color;
	public int price;
	
	public inflearn_11() {
		// TODO Auto-generated constructor stub
		System.out.println("Bicycle constructor-1");
	}
	public inflearn_11(String c,int p) {
		System.out.println("Bicycle constructor-2");
		color = c;
		price = p;
	}
	public void info() {
		System.out.println("--info--");
		System.out.println("color:"+color);
		System.out.println("price:"+price);
	}
}
