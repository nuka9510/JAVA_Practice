package inflearn;

public class inflearn_12 {
	
	public static void main(String[] args) {
		
		inflearn_10 myCar1 = new inflearn_10(); // Grandeur constructor, ����(myCar1) ����, inflearn_10Ŭ������ �ִ� ������
		myCar1.color = "red"; // myCar1.color = red, inflearn_10Ŭ�������� ������ ����(color)�� ����
		myCar1.gear = "auto"; // myCar1.gear = auto, inflearn_10Ŭ�������� ������ ����(gear)�� ����
		myCar1.price = 100; // myCar1.price = 100, inflearn_10Ŭ�������� ������ ����(price)�� ����
		
		myCar1.run(); // --run--, inflearn_10Ŭ������ �ִ� �޼���(public void run(){})�� �����Ѵ�.
		myCar1.stop(); // --stop--, inflearn_10Ŭ������ �ִ� �޼���(public void stop(){})�� �����Ѵ�.
		myCar1.info(); /* --info--  inflearn_10Ŭ������ �ִ� �޼���(public void stop(){})�� �����Ѵ�.
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
		
		inflearn_11 myBicycle1 = new inflearn_11("red",100); // Bicycle constructor-2, ����(myBicycle1) ����, inflearn_11Ŭ������ �ִ� ������(public inflearn(String c,int p){})
		myBicycle1.info(); /* --info--
		 					  color:red
		 					  price:100 */
		
		myBicycle1.color = "yellow"; // myBicycle1.color = yellow, inflearn_11Ŭ�������� ������ ����(color)�� ����
		myBicycle1.info(); /* --info--
		 					  color:yellow
		 					  price:100 */
		
		inflearn_11 myBicycle2 = new inflearn_11(); // Bicycle constructor-1, ����(myBicycle2) ����, inflearn_11Ŭ������ �ִ� ������(public inflearn(){})������
		
		myBicycle2.color = "blue"; // myBicycle.color = blue, inflearn_11Ŭ�������� ������ ����(color)�� ����
		myBicycle2.price = 200; // mybicycle.price = 200, inflearn_11Ŭ�������� ������ ����(price)�� ����
		myBicycle2.info(); /* --info--
		 					  color:blue
		 					  price:200 */
	}

}
