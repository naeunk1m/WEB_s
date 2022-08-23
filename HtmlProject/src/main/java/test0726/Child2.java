package test0726;

public class Child2 extends Parent{
	public void prn2() {
		System.out.println("자식클래스2");
	}

	@Override
	public void prn() {
//		super.prn();
		System.out.println("부모메서드 재정의2");
	}
	
}
