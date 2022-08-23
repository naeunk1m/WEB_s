package test0727;

public class AbsChild extends AbsClass{
	//추상클래스 상속 
	// 추상메서드 무조건 오버라이딩 해야됨
	@Override
	public void method1() {
		// 추상메서드 틀을 가지고 구체적으로 구현
		System.out.println("추상메서드 오버라이딩 AbsChild method1()");
	}
}
