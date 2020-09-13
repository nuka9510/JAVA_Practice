package inflearn_20;

public class Main {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		
		child.parentFun();
		child.childFun();
		/*
		child.privateFun(); // ParentClass클래스의 privateFun메서드가
							   private메서드 이므로 사용이 불가능함
		*/
		
		child.makeJJajang(); /* ParentClass클래스의 makeJJajang메서드가
								ChildClass클래스에서 @Override로
								재정의 됐으므로 ChildClass의 
		 						makeJJajang메서드을 실행한다.*/
		
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
