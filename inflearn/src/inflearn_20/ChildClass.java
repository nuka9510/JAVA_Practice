package inflearn_20;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	
	public void childFun() {
		System.out.println("-- childFun() START --");
	}
	
	@Override // ���� @Override�� ������ �ʿ�� ����
	public void makeJJajang() {
		System.out.println("-- more delicious make JJajang() START --");
	}
	
	int openYear = 2000;
	
	public void getOpenYear() {
		System.out.println("ChildClass's Open Year : "+this.openYear);
		System.out.println("ParentClass's Open Year : "+super.openYear);
	}

}
