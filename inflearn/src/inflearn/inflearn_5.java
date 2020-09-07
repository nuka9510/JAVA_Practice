package inflearn;

public class inflearn_5 {
	
	public static void main(String[] args) {
		
		//대입 연산자
		int x=10; // x = 10
		int y=20; // y = 20
		
		System.out.println("x="+x); // 10
		System.out.println("y="+y); //20
		
		x = y; // x = y = 20
		
		System.out.println("x="+x); // 20
		System.out.println("y="+y); // 20
		
		System.out.println();
		
		//산술 연산자
		x = 10; // x = 10
		y = 20; // y = 20
		
		System.out.println("x+y="+(x+y)); // x+y=30, +는 덧셈
		System.out.println("x-y="+(x-y)); // x-y=-10, -는 뺄셈
		System.out.println("x*y="+(x*y)); // x*y=200, *는 곱셈
		System.out.println("x/y="+(x/y)); // x/y=0, /는 나눗셈
		System.out.println("x%y="+(x%y)); // x%y=10, %는 나눗셈 후 나머지 값
		
		System.out.println();
		
		//복합대입 연산자
		x = 10; // x = 10
		System.out.println("x+=10:"+(x+=10)); // x+=10:20, x = 20, 변수(x)+=수(10)이면 변수와 수를 더한 값을 출력한 뒤 변수를 출력된 값으로 초기화 한다.  
		System.out.println("x="+x); // x=20
		x = 10; // x = 10
		System.out.println("x-=10:"+(x-=10)); // x-=10:0, x = 0,  변수(x)-=수(10)이면 변수와 수를 뺀 값을 출력한 뒤 변수를 출력된 값으로 초기화 한다.
		System.out.println("x="+x); // x=0
		x = 10; // x = 10
		System.out.println("x*=10:"+(x*=10)); // x*=10:100, x = 100, 변수(x)*=수(10)이면 변수와 수를 곱한 값을 출력한 뒤 변수를 출력된 값으로 초기화 한다.
		System.out.println("x="+x); // x=100
		x = 10; // x = 10
		System.out.println("x/=10:"+(x/=10)); // x/=10:1, x = 1, 변수(x)/=수(10)이면 변수와 수를 나눈 값을 출력한 뒤 변수를 출력된 값으로 초기화 한다.
		System.out.println("x="+x); // x=1
		x = 10; // x = 10
		System.out.println("x%=10:"+(x%=10)); // x%=:0, x = 0, 변수(x)%=수(10)이면 변수와 수를 나누고 남은 나머지 값을 출력한 뒤 변수를 출력된 값으로 초기화 한다.
		System.out.println("x="+x); // x=0
		
		System.out.println();
		
		//관계 연산자
		x = 10; // x = 10
		y = 20; // y = 20
		
		System.out.println("x>y:"+(x>y)); // x>y:false, x>y(x가 y보다 크다)의 값이 참일 경우 true를 거짓일 경우 false를 출력한다.
		System.out.println("x<y:"+(x<y)); // x<y:true, x<y(x가 y보다 작다)의 값이 참일 경우 true를 거짓일 경우 false를 출력한다.
		System.out.println("x>=y:"+(x>=y)); // x>=y:false, x>=y(x가 y보다 크거나 같다)의 값이 참일 경우 true를 거짓일 경우 false를 출력한다.
		System.out.println("x<=y:"+(x<=y)); // x<=y:true, x<=y(x가 y보다 작거나 같다)의 값이 참일 경우 true를 거짓일 경우 false를 출력한다.
		System.out.println("x==y:"+(x==y)); // x==y:false, x==y(x가 y와 같다)의 값이 참일 경우 true를 거짓일 경우 false를 출력한다.
		System.out.println("x!=y:"+(x!=y)); // x!=y:true, x!=y(x가 y와 같지 않다)의 값이 참일 경우 true를 거짓일 경우 false를 출력한다.
		
		System.out.println();
		
		//증감 연산자
		x = 10; // x = 10
		System.out.println("++x:"+(++x)); // ++x:11, x = 11, ++변수(x)일 경우 변수에 1을 더한 값을 출력한 뒤 출력된 값으로 초기화 한다. 
		x = 10; // x = 10
		System.out.println("--x:"+(--x)); // --x:9, x = 9, --변수(x)일 경우 변수에 1을 뺀 값을 출력한 뒤 출력된 값으로 초기화 한다.
		x = 10; // x = 10
		System.out.println("x++:"+(x++)); // x++:10, x = 11, 변수(x)++일 경우 변수 값을 출력한 뒤 변수에 1을 더한 값으로 초기화 한다.
		System.out.println("x="+x); // x=11
		x = 10; // x = 10
		System.out.println("x--:"+(x--)); // x--:10, x = 9, 변수(x)--일 경우 변수 값을 출력한 뒤 변수에 1을 뺀 값으로 초기화 한다.
		System.out.println("x="+x); // x=9
		
		System.out.println();
		
		//논리 연산자
		boolean b1 = false; // b1 = false(거짓)
		boolean b2 = true; // b2 = true(참)
		System.out.println("b1&&b2:"+(b1&&b2)); // b1&&b2:false, 변수(b1)&&변수(b2)일 경우 두 변수가 모두 참일 때 true를 그 외에는 false를 출력한다.
		System.out.println("b1||b2:"+(b1||b2)); // b1||b2:true, 변수(b1)||변수(b2)일 경우 두 변수가 모두 참 이거나 둘 중 한 변수가 참이 때 true를 그 외에는 false를 출력한다. 
		System.out.println("!b1:"+!b1); // !b1:true, !변수(b1)일 경우 변수의 반대 값을 출력한다.
		System.out.println("!b2:"+!b2); // !b2:false
		
		System.out.println();
		
		//조건(삼항) 연산자
		x = 10; // x = 10
		y = 20; // y = 20
		int result = 0; // result = 0
		result = (x>y) ? 100 : 200; // result = 200, 변수 초기화 값이 참일 경우 100 거짓일 경우 200으로 변수를 초기화 한다.
		System.out.println("result="+result); // result=200
		
		result = (x<y) ? 100 : 200; // result = 100
		System.out.println("result="+result); // result=100
		
		result = (x==y) ? 100 : 200; // result = 200
		System.out.println("result="+result); // result=200
		
		System.out.println();
		
		//비트 연산자
		x = 2; // x = 2
		y = 3; // y = 3
		System.out.println("x&y:"+(x&y)); // x&y:2, 변수(x)와 변수(y)를 2진수(0,1)로 변환하여 두 변수 모두 1인 값은 1로 그 외의 값으 0으로 계산한 뒤 10진수로 변환하여 출력한다.
		System.out.println("x|y:"+(x|y)); // x|y:3, 변수(x)와 변수(y)를 2진수(0,1)로 변환하여 두 변수 중 하나라도 1인 값은 1로 그 외의 값으 0으로 계산한 뒤 10진수로 변환하여 출력한다.
		System.out.println("x^y:"+(x^y)); // x^y:1, 변수(x)와 변수(y)를 2진수(0,1)로 변환하여 두 변수가 일치하지 않는 값은 1로 그 외의 값으 0으로 계산한 뒤 10진수로 변환하여 출력한다.
	}

}
