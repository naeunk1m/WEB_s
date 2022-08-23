package test0727;

public class Main {
	public static void main(String[] args) {

//		//추상클래스
//		//부모 = 자식 객체생성 (업캐스팅)
//		AbsClass absClass=new AbsChild();
//		absClass.method1(); //추상메서드 오버라이딩
//		absClass.method2(); //일반메서드
		
		//인터페이스(다중상속가능)
		//부모 = 자식 객체생성 (업캐스팅)
		Inter inter=new InterClass1();
		//다형성
		inter.interMethod();
		
		inter=new InterClass2();
		inter.interMethod();
		
		
		//OtherClass 객체생성
		OtherClass otherClass=new OtherClass();
		
		InterClass1 inter1=new InterClass1();
		otherClass.otherMethod(inter1);
		
		InterClass2 inter2=new InterClass2();
		otherClass.otherMethod(inter2);
		
		//메서드 오버로딩
		System.out.println(10);
		System.out.println(3.4);
		System.out.println("문자");
		
	}
}
