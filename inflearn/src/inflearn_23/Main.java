package inflearn_23;

public class Main {
	
	public static void main(String[] args) {
		
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1 + " " + s2 + " " + s3);};
		li1.method("Hello", "java", "World");
		
		System.out.println();
		
		LambdaInterface2 li2 = (s1) -> {
			System.out.println(s1);};
		li2.method("Hello");
		
		System.out.println();
		
		LambdaInterface2 li3 = (s1) ->
			System.out.println(s1);
		li3.method("Hello");
		
		System.out.println();
		
		LambdaInterface2 li4 = s1 ->
			System.out.println(s1);
		li4.method("Hello");
		
		System.out.println();
		
		LambdaInterface3 li5 = () ->
			System.out.println("no parameter");
		li5.method();
		
		System.out.println();
		
		LambdaInterface4 li6 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(li6.method(10, 20));
		
		li6 = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.println(li6.method(10, 20));
		
		li6 = (x, y) -> {
			int result = x - y;
			return result;
		};
		System.out.println(li6.method(10, 20));
	}

}
