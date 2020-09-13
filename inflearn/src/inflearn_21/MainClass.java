package inflearn_21;

public class MainClass {
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("oc.num : "+oc.num);
		System.out.println("oc.str1 : "+oc.str1);
		
		System.out.println();
		
		OuterClass.InnerClass in = oc.new InnerClass();
		System.out.println("in.num : "+in.num);
		System.out.println("in.str2 : "+in.str2);
		
		System.out.println();
		
		OuterClass.SInnerClass si = new OuterClass.SInnerClass();
		System.out.println("si.num : "+si.num3);
		System.out.println("si.str3 : "+si.str3);
		
		System.out.println();
		
		new AnonymousClass().method();
		System.out.println();
		
		new AnonymousClass() {
			@Override
			public void method() {
				System.out.println("-- AnonymousClass's Override method START --");
			};
		}.method();
		
		System.out.println();
		
		InterfaceA ia = new ImplementClass();
		InterfaceB ib = new ImplementClass();
		InterfaceC ic = new ImplementClass();
		InterfaceD id = new ImplementClass();
		
		ia.funA();
		ib.funB();
		ic.funC();
		id.funD();
		
		System.out.println();
		
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		Toy toys[] = {robot, airplane};
		
		System.out.println(toys.length);
		System.out.println();
		
		for(int i=0;i<toys.length;i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
	}
}
