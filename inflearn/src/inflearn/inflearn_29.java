package inflearn;

public class inflearn_29 {
	public static void main(String[] args) {
		inflearn_29 inf = new inflearn_29();
		try {
			inf.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void firstMethod() throws Exception {
		secondMethod();
	}
	
	public void secondMethod() throws Exception {
		thirdMethod();
	}
	
	public void thirdMethod() throws Exception {
		System.out.println(10/0);
	}

}
