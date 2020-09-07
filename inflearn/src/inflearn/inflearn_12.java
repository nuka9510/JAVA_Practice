package inflearn;

public class inflearn_12 {
	
	public static void main(String[] args) {
		
		inflearn_10 myCar1 = new inflearn_10(); // Grandeur constructor, 변수(myCar1) 선언, inflearn_10클래스에 있는 생성자
		myCar1.color = "red"; // myCar1.color = red, inflearn_10클래스에서 선언한 변수(color)에 지정
		myCar1.gear = "auto"; // myCar1.gear = auto, inflearn_10클래스에서 선언한 변수(gear)에 지정
		myCar1.price = 100; // myCar1.price = 100, inflearn_10클래스에서 선언한 변수(price)에 지정
		
		myCar1.run(); // --run--, inflearn_10클래스에 있는 메서드(public void run(){})를 실행한다.
		myCar1.stop(); // --stop--, inflearn_10클래스에 있는 메서드(public void stop(){})를 실행한다.
		myCar1.info(); /* --info--  inflearn_10클래스에 있는 메서드(public void stop(){})를 실행한다.
		 				  color:red
		 				  gear:auto
		 				  price:100 */
		
		myCar1.color = "yellow"; // myCar1.color = yellow
		myCar1.gear = "auto"; // myCar1.gear = auto
		myCar1.price = 500; // myCar1.price = 500
		
		myCar1.run(); // --run--
		myCar1.stop(); //--stop
		myCar1.info(); /* --info--
		 				  color:yellow
		 				  gear:auto
		 				  price:500 */
		
		inflearn_11 myBicycle1 = new inflearn_11("red",100); // Bicycle constructor-2, 변수(myBicycle1) 선언, inflearn_11클래스에 있는 생성자(public inflearn(String c,int p){})
		myBicycle1.info(); /* --info--
		 					  color:red
		 					  price:100 */
		
		myBicycle1.color = "yellow"; // myBicycle1.color = yellow, inflearn_11클래스에서 선언한 변수(color)에 지정
		myBicycle1.info(); /* --info--
		 					  color:yellow
		 					  price:100 */
		
		inflearn_11 myBicycle2 = new inflearn_11(); // Bicycle constructor-1, 변수(myBicycle2) 선언, inflearn_11클래스에 있는 생성자(public inflearn(){})생성자
		
		myBicycle2.color = "blue"; // myBicycle.color = blue, inflearn_11클래스에서 선언한 변수(color)에 지정
		myBicycle2.price = 200; // mybicycle.price = 200, inflearn_11클래스에서 선언한 변수(price)에 지정
		myBicycle2.info(); /* --info--
		 					  color:blue
		 					  price:200 */
	}

}
