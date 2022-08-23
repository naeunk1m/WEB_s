package test0726;

public class Main {
	public static void main(String[] args) {
		// Child1 객체생성
//		Child1 child1=new Child1();
//		child1.prn();
//		child1.prn1();
//		
//		Child2 child2=new Child2();
//		child2.prn();
//		child2.prn2();
		
//		//업캐스팅  부모=자식
//		Parent parent=new Child1();
//		// 다형성
//		parent.prn();
		
//		parent=new Child2();
//		parent.prn();
		
//		//다운캐스팅 자식=(자식 형변환)부모
//		Child1 child1=(Child1)parent;
//		child1.prn();
//		child1.prn1();
		
//		OtherClass에서 Child1, Child2 전달
//		OtherClass 객체생성
		OtherClass otherClass=new OtherClass();
		Child1 child1=new Child1();
		otherClass.print(child1);
		
		Child2 child2=new Child2();
		otherClass.print(child2);
		
		
	}
}
