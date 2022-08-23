package test0721;

public class Main {
	public static void main(String[] args) {

		//기억장소 할당 => 객체생성 
		Member member=new Member();
		System.out.println("member주소 : "+member);
		// set메서드 호출 값 저장
//		member.id="kim";
		member.setId("kim");
		member.setPass("p123");
		member.setName("김길동");
		member.setAge(20);

		// MemberDB 객체생성 기억장소 할당
		MemberDB memberDB=new MemberDB();
		
		// insertMember메서드 호출
		memberDB.insertMember(member);
		
		// updateMember메서드 호출
		member.setId("lee");
		member.setPass("p567");
		member.setName("이길동");
		member.setAge(10);
		
		memberDB.updateMember(member);
		
		// deletMember메서드 호출
		String id=member.getId();
		memberDB.deleteMember(id);
		
		
		Member member2=memberDB.selectMember(id);
		System.out.println("디비에 받은 주소:"+member2);
		System.out.println(member2.getId());
		System.out.println(member2.getPass());
		System.out.println(member2.getName());
		System.out.println(member2.getAge());
		
	}

}
