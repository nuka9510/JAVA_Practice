package inflearn;

public class inflearn_18 {
	public inflearn_18() {
		System.out.println("--Default constructor--");
	}
	
	public inflearn_18(String s,int[] i) {
		System.out.println("--UserDefined constructor--");
		System.out.println("s : " + s);
		System.out.println("i : " + i);
	}
	
	public int x;
	public int y;
	public inflearn_18(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	public void getInfo() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	
	protected void finalize() throws Throwable{
		System.out.println("--finalize() method--");
		
		super.finalize();
	}

}
