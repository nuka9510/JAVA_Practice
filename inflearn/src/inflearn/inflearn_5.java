package inflearn;

public class inflearn_5 {
	
	public static void main(String[] args) {
		
		//���� ������
		int x=10; // x = 10
		int y=20; // y = 20
		
		System.out.println("x="+x); // 10
		System.out.println("y="+y); //20
		
		x = y; // x = y = 20
		
		System.out.println("x="+x); // 20
		System.out.println("y="+y); // 20
		
		System.out.println();
		
		//��� ������
		x = 10; // x = 10
		y = 20; // y = 20
		
		System.out.println("x+y="+(x+y)); // x+y=30, +�� ����
		System.out.println("x-y="+(x-y)); // x-y=-10, -�� ����
		System.out.println("x*y="+(x*y)); // x*y=200, *�� ����
		System.out.println("x/y="+(x/y)); // x/y=0, /�� ������
		System.out.println("x%y="+(x%y)); // x%y=10, %�� ������ �� ������ ��
		
		System.out.println();
		
		//���մ��� ������
		x = 10; // x = 10
		System.out.println("x+=10:"+(x+=10)); // x+=10:20, x = 20, ����(x)+=��(10)�̸� ������ ���� ���� ���� ����� �� ������ ��µ� ������ �ʱ�ȭ �Ѵ�.  
		System.out.println("x="+x); // x=20
		x = 10; // x = 10
		System.out.println("x-=10:"+(x-=10)); // x-=10:0, x = 0,  ����(x)-=��(10)�̸� ������ ���� �� ���� ����� �� ������ ��µ� ������ �ʱ�ȭ �Ѵ�.
		System.out.println("x="+x); // x=0
		x = 10; // x = 10
		System.out.println("x*=10:"+(x*=10)); // x*=10:100, x = 100, ����(x)*=��(10)�̸� ������ ���� ���� ���� ����� �� ������ ��µ� ������ �ʱ�ȭ �Ѵ�.
		System.out.println("x="+x); // x=100
		x = 10; // x = 10
		System.out.println("x/=10:"+(x/=10)); // x/=10:1, x = 1, ����(x)/=��(10)�̸� ������ ���� ���� ���� ����� �� ������ ��µ� ������ �ʱ�ȭ �Ѵ�.
		System.out.println("x="+x); // x=1
		x = 10; // x = 10
		System.out.println("x%=10:"+(x%=10)); // x%=:0, x = 0, ����(x)%=��(10)�̸� ������ ���� ������ ���� ������ ���� ����� �� ������ ��µ� ������ �ʱ�ȭ �Ѵ�.
		System.out.println("x="+x); // x=0
		
		System.out.println();
		
		//���� ������
		x = 10; // x = 10
		y = 20; // y = 20
		
		System.out.println("x>y:"+(x>y)); // x>y:false, x>y(x�� y���� ũ��)�� ���� ���� ��� true�� ������ ��� false�� ����Ѵ�.
		System.out.println("x<y:"+(x<y)); // x<y:true, x<y(x�� y���� �۴�)�� ���� ���� ��� true�� ������ ��� false�� ����Ѵ�.
		System.out.println("x>=y:"+(x>=y)); // x>=y:false, x>=y(x�� y���� ũ�ų� ����)�� ���� ���� ��� true�� ������ ��� false�� ����Ѵ�.
		System.out.println("x<=y:"+(x<=y)); // x<=y:true, x<=y(x�� y���� �۰ų� ����)�� ���� ���� ��� true�� ������ ��� false�� ����Ѵ�.
		System.out.println("x==y:"+(x==y)); // x==y:false, x==y(x�� y�� ����)�� ���� ���� ��� true�� ������ ��� false�� ����Ѵ�.
		System.out.println("x!=y:"+(x!=y)); // x!=y:true, x!=y(x�� y�� ���� �ʴ�)�� ���� ���� ��� true�� ������ ��� false�� ����Ѵ�.
		
		System.out.println();
		
		//���� ������
		x = 10; // x = 10
		System.out.println("++x:"+(++x)); // ++x:11, x = 11, ++����(x)�� ��� ������ 1�� ���� ���� ����� �� ��µ� ������ �ʱ�ȭ �Ѵ�. 
		x = 10; // x = 10
		System.out.println("--x:"+(--x)); // --x:9, x = 9, --����(x)�� ��� ������ 1�� �� ���� ����� �� ��µ� ������ �ʱ�ȭ �Ѵ�.
		x = 10; // x = 10
		System.out.println("x++:"+(x++)); // x++:10, x = 11, ����(x)++�� ��� ���� ���� ����� �� ������ 1�� ���� ������ �ʱ�ȭ �Ѵ�.
		System.out.println("x="+x); // x=11
		x = 10; // x = 10
		System.out.println("x--:"+(x--)); // x--:10, x = 9, ����(x)--�� ��� ���� ���� ����� �� ������ 1�� �� ������ �ʱ�ȭ �Ѵ�.
		System.out.println("x="+x); // x=9
		
		System.out.println();
		
		//�� ������
		boolean b1 = false; // b1 = false(����)
		boolean b2 = true; // b2 = true(��)
		System.out.println("b1&&b2:"+(b1&&b2)); // b1&&b2:false, ����(b1)&&����(b2)�� ��� �� ������ ��� ���� �� true�� �� �ܿ��� false�� ����Ѵ�.
		System.out.println("b1||b2:"+(b1||b2)); // b1||b2:true, ����(b1)||����(b2)�� ��� �� ������ ��� �� �̰ų� �� �� �� ������ ���� �� true�� �� �ܿ��� false�� ����Ѵ�. 
		System.out.println("!b1:"+!b1); // !b1:true, !����(b1)�� ��� ������ �ݴ� ���� ����Ѵ�.
		System.out.println("!b2:"+!b2); // !b2:false
		
		System.out.println();
		
		//����(����) ������
		x = 10; // x = 10
		y = 20; // y = 20
		int result = 0; // result = 0
		result = (x>y) ? 100 : 200; // result = 200, ���� �ʱ�ȭ ���� ���� ��� 100 ������ ��� 200���� ������ �ʱ�ȭ �Ѵ�.
		System.out.println("result="+result); // result=200
		
		result = (x<y) ? 100 : 200; // result = 100
		System.out.println("result="+result); // result=100
		
		result = (x==y) ? 100 : 200; // result = 200
		System.out.println("result="+result); // result=200
		
		System.out.println();
		
		//��Ʈ ������
		x = 2; // x = 2
		y = 3; // y = 3
		System.out.println("x&y:"+(x&y)); // x&y:2, ����(x)�� ����(y)�� 2����(0,1)�� ��ȯ�Ͽ� �� ���� ��� 1�� ���� 1�� �� ���� ���� 0���� ����� �� 10������ ��ȯ�Ͽ� ����Ѵ�.
		System.out.println("x|y:"+(x|y)); // x|y:3, ����(x)�� ����(y)�� 2����(0,1)�� ��ȯ�Ͽ� �� ���� �� �ϳ��� 1�� ���� 1�� �� ���� ���� 0���� ����� �� 10������ ��ȯ�Ͽ� ����Ѵ�.
		System.out.println("x^y:"+(x^y)); // x^y:1, ����(x)�� ����(y)�� 2����(0,1)�� ��ȯ�Ͽ� �� ������ ��ġ���� �ʴ� ���� 1�� �� ���� ���� 0���� ����� �� 10������ ��ȯ�Ͽ� ����Ѵ�.
	}

}
