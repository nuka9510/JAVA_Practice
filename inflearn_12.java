package inflearn;

public class inflearn_12 {
	
	public static void main(String[] args) {
		
		inflearn_10 myCar1 = new inflearn_10();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		myCar1.color = "yellow";
		myCar1.gear = "auto";
		myCar1.price = 500;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		inflearn_11 myBicycle = new inflearn_11("red",100);
		myBicycle.info();
		
		myBicycle.color = "yellow";
		myBicycle.info();
	}

}
