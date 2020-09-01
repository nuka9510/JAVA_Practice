package inflearn;

public class inflearn_13 {
	public static void main(String[] args) {
		
		inflearn_14 child1 = new inflearn_14(); // --ChildClass constructor--, inflearn_14에 있는 생성자
		child1.setInfo("hong gil dong", "M", 20); /* child1.name = hong gil dong
													 child1.gender = M
													 child1.age = 20 */
		
		child1.getInfo(); /* --getInfo() START--
		 					 name:hong gil dong
		 					 gender:M
		 					 age:20 */
	}

}
