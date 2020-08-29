package pjtTest;

public class inflearn_3 {
	
	public static void main(String[] args) {
		
		//기본 자료형		
		char c = 'c'; // 정수형 2byte, c = c
		System.out.println("c="+c); // c
		
		int i = 10; // 정수형 4byte, i = 10
		System.out.println("i="+i); // 10
				
		double d = 10.123; // 실수형 8byte, d = 10.123
		System.out.println("d="+d); // 10.123
		
		boolean b = false; // 논리형(참, 거짓) 1byte, b = false
		System.out.println("b="+b); // false
		
		String s = "Hello Java World!!!!!!"; // 문자열, s = Hello Java World!!!!!!
		System.out.println("s="+s); // Hello Java World!!!!!!
		
		System.out.println();
		
		//자동(묵시적) 형 변환
		//작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by = 10; // 정수형 1byte, by = 10
		int in = by; // in = by = 10
		System.out.println("in="+in); // 10
		
		//명시적 형 변환
		//큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int iVar = 100; // iVar = 100
		byte bVar = (byte)iVar; // bVar = iVar = 100, 명시적 형 변환에서는 변환 시 자료형을 명시
		System.out.println("bVar="+bVar); // 100
		
		iVar = 123456; // iVar변수 초기화, iVar = 123456
		bVar = (byte)iVar; // bVar변수 초기화, bVar = iVar = 123456 허나 byte의 메모리공간이 값을 담지 못 함
		System.out.println("bVar="+bVar); // 64, byte의 메모리공간으로는 123456의 값은 담지 못 하여 변환된 값
	}

}
