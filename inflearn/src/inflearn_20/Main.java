package inflearn_20;

public class Main {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		
		child.parentFun();
		child.childFun();
		/*
		child.privateFun(); // ParentClassŬ������ privateFun�޼��尡
							   private�޼��� �̹Ƿ� ����� �Ұ�����
		*/
		
		child.makeJJajang(); /* ParentClassŬ������ makeJJajang�޼��尡
								ChildClassŬ�������� @Override��
								������ �����Ƿ� ChildClass�� 
		 						makeJJajang�޼����� �����Ѵ�.*/
		
		ParentClass[] parr = new ParentClass[2];
		
		ParentClass fch = new FirstChildClass();
		ParentClass sch = new SecondChildClass();
		
		parr[0] = fch;
		parr[1] = sch;
		
		for(int i=0;i<parr.length;i++) {
			parr[i].makeJJajang();
		}
		
		child.getOpenYear();
	}

}
