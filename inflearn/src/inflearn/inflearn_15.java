package inflearn;

public class inflearn_15 {
	public static void main(String[] args) {
		
		inflearn_16 obj1 = new inflearn_16();
		inflearn_16 obj2 = new inflearn_16();
		inflearn_16 obj3 = new inflearn_16();
		
		System.out.println("obj1"+obj1);
		System.out.println("obj2"+obj2);
		System.out.println("obj3"+obj3);
		
		if(obj1==obj2) {
			System.out.println("obj1==obj2");
		}else {
			System.out.println("obj1!=obj2");
		}if(obj2==obj3) {
			System.out.println("obj2==obj3");
		}else {
			System.out.println("obj2!=obj3");
		}if(obj1==obj3) {
			System.out.println("obj1==obj3");
		}else {
			System.out.println("obj1!=obj3");
		}
		
		obj1.getInfo();
		
		obj1 = null;
		//obj1.getInfo();
		
		obj2.getInfo();
	}

}
