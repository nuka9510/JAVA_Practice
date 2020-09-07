package inflearn;

public class inflearn_4 {
	
	public static void main(String[] args) {
		
		//주석
		/*
		 * 주석
		 */
		
		//특수 문자
		System.out.println("Good\tMorning"); // Good	Morning, \t(탭)
		System.out.println("Good\nMorning"); /* Good
		 										Morning, \n(줄 바꿈) */
		System.out.println("Good\'Morning\'"); // Good'Morning',  \'(작은 따옴표)
		System.out.println("Good\"Morning\""); // Good"Morning", \"(큰 따옴표)
		System.out.println("Good\\Morning\\"); // Good\Morning\, \\(역 슬래쉬)
		
		System.out.println();
		
		//서식문자
		System.out.println("오늘의 기온은 10도 입니다."); // 오늘의 기온은 10도 입니다.
		System.out.printf("오늘의 기온은 %d도 입니다.\n",10); // 오늘의 기온은 10도 입니다., %d(10진수)
		
		int num1 = 20; // num1 = 20
		System.out.println("오늘의 기온은 "+num1+"도 입니다."); // 오늘의 기온은 20 도 입니다., num1 = 20
		System.out.printf("오늘의 기온은 %d도 입니다.\n",num1); // 오늘의 기온은 20 도 입니다., num1 = 20
		
		System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n",6,2,10); // 홍길동's Info. : 6학년2반10번
		
		System.out.println();
		
		//정수
		int num2 = 30; // num2 = 30
		System.out.printf("num2(10진수) : %d\n",num2); // 30
		System.out.printf("num2(8진수) : %o\n",num2); // 36, %o(8진수)
		System.out.printf("num2(16진수) : %x\n",num2); // 1e, %x(16진수)
		
		System.out.println();
		
		//문자
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n",'a','A'); // 소문자'a'의 대문자는 'A'입니다., %c(문자)
		
		System.out.println();
		
		//문자열
		System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.\n","java","JAVA"); // 'java'를 대문자로 바꾸면'JAVA'입니다., %s(문자열)
		
		System.out.println();
		
		//실수
		float f = 1.23f; // 실수형 4byte, f = 1.23, float은 변수 초기화 값 뒤에 f를 반드시 붙여야 한다.
		System.out.printf("f=%f\n",f); // 1.230000, %f(실수), 소숫점 지정이 없으면 소숫점 아래 6번째 자리까지 출력됨
		
		double d = 1.23456; // d = 1.123456
		System.out.printf("d=%f\n",d); // 1.234560, 소숫점 지정이 없으면 소숫점 아래 6번째 자리까지 출력됨
		
		System.out.println();
		
		//서식문자 정렬 기능
		System.out.printf("%d\n",123); // 123
		System.out.printf("%d\n",1234); // 1234
		System.out.printf("%d\n",12345); // 12345
		
		System.out.println();
		
		System.out.printf("%5d\n",123); // **123, *은 빈공간임, %d에 정렬 값(정수)을 주었을 때 정렬 값 위치를 기준으로 출력됨
		System.out.printf("%5d\n",1234); // *1234, *은 빈공간임
		System.out.printf("%5d\n",12345); // 12345
		
		System.out.println();
		
		//서식문자 소수점제한 기능
		System.out.printf("%f\n",1.23); // 1.230000
		System.out.printf("%.0f\n",1.23); // 1, %f에 입력한 소숫점 지정 값 만큼 출력됨
		System.out.printf("%.1f\n",1.23); // 1.2
		System.out.printf("%.2f\n",1.23); // 1.23
		System.out.printf("%.3f\n",1.23); // 1.230
	}

}
