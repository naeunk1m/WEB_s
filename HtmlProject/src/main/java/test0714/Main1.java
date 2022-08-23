package test0714;

public class Main1 {
	//메서드(멤버함수)
	public static void fun(int a,int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		return;
	}

	public static void main(String[] args) {
		//변하는 수 => 변수=> 기억장소 할당, 이름부여,초기값 할당
		fun(5,7);
	}

}
