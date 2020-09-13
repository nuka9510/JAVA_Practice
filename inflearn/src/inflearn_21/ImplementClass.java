package inflearn_21;

public class ImplementClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD {
	public ImplementClass() {
		System.out.println("ImplementClass constructor");
	}

	@Override
	public void funA() {
		System.out.println("-- funA START --");
		
	}

	@Override
	public void funB() {
		System.out.println("-- funB START --");
		
	}

	@Override
	public void funC() {
		System.out.println("-- funC START --");
		
	}

	@Override
	public void funD() {
		System.out.println("-- funD START --");
		
	}
}
