package test0714;

public class Main2 {
	public static void main(String[] args) {
		//객체생성 ,기억장소할당
		int b=10;
		System.out.println(b);
		String a=new String("값");
		
		Student s=new Student();
		System.out.println(s);
		s.num=1;
		s.name="홍길동";
		s.prn();
	}
}
