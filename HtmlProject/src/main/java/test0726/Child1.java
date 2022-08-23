package test0726;

public class Child1 extends Parent{
//자식클래스 
		public void prn1() {
			System.out.println("자식클래스1");
		}
		//메서드 오버라이딩 : 부모의 메서드 재정의
		// alt shift s -> v
		@Override
		public void prn() {
//			super.prn();
			System.out.println("부모메서드 재정의1");
		}
		
}
