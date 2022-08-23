package test0727;

public abstract class AbsClass {
	//추상클래스 : 부모클래스, 공통적인 틀, 일반적인 클래스 기능도 가짐
	
	// 추상메서드 : 메서드 틀(구현 내용 없음)
	public abstract void method1() ;
	
	// 일반메서드 
	public void method2() {
		System.out.println("AbsClass method2");
	}
}
