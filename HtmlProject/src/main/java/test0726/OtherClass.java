package test0726;

public class OtherClass {

	public void print(Parent parent) {
		//  업캐스팅 parent=child1;
		//  업캐스팅 parent=child2;
		parent.prn();
		// 다운캐스팅 
		Child1 child1=(Child1)parent;
		Child2 child2=(Child2)parent;
	}

	
}
