package test0719;

public class Main {
	public static void main(String[] args) {
		//객체생성 기억장소 할당
		Student student=new Student();
//		student.num=1;
		// set메서드 호출 멤버변수에 값 저장
		student.setNum(1);
		student.setName("홍길동");
		student.setKor(80);
		student.setEng(100);
		student.setMath(90);
		
		student.prn();
		System.out.println("총점:"+student.sum());
		System.out.println("평균:"+student.avg()); 
		
		// Student student2생성할때 초기값을 받아서 생성
		Student student2=new Student(2, "이길동", 100, 100, 100);
		
		student2.prn();
		System.out.println("총점:"+student2.sum());
		System.out.println("평균:"+student2.avg()); 
		
		//Member객체생성
		Member member=new Member();
		// set
		member.setId("kim");
		member.setPass("1234");
		member.setName("김길동");
		member.setBirth("1999-12-25");
		member.setEmail("kim@n.com");
		member.setPhone("010-1234-5678");
		// get
		System.out.println(member.getId());
		System.out.println(member.getPass());
		System.out.println(member.getName());
		System.out.println(member.getBirth());
		System.out.println(member.getEmail());
		System.out.println(member.getPhone());
		
	}
}
