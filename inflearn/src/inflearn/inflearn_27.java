package inflearn;

public class inflearn_27 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i/j;
		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
		System.out.println("Exception AFTER");

	}

}
