package inflearn;

public class inflearn_17 {
	public static void main(String[] args) {
		inflearn_18 obj1 = new inflearn_18();
		System.out.println();
		
		int[] i = {10, 20, 30};
		inflearn_18 obj2 = new inflearn_18("Hello", i);
		
		inflearn_18 obj3;
		
		obj3 = new inflearn_18();
		obj3 = new inflearn_18();
		
		inflearn_18 obj4 = new inflearn_18(10, 20);
		obj4.getInfo();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		System.gc();
	}

}
