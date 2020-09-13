package inflearn_22;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractClassEx ex = new ClassEx(10, "java");
		ex.fun1();
		ex.fun2();
		
		System.out.println();
		
		Bank myBank = new MyBank("¹ÚÂùÈ£", "123-4567-89012", 10000);
		
		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();
		
		System.out.println();
		
		myBank.getInfo();
	}

}
