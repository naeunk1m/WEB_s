package test0721;

public class MemberDB {

	// 회원정보 DB 저장 insert
	public void insertMember(Member member) {
		System.out.println("받은주소값 : "+member);
		System.out.println("회원가입");
		System.out.println("아이디 :"+member.getId());
		System.out.println("비밀번호 :"+member.getPass());
		System.out.println("이름 :"+member.getName());
		System.out.println("나이 :"+member.getAge());
	}
	
	// 회원정보 DB 수정 update
	public void updateMember(Member member) {
		System.out.println("받은주소값 : "+member);
		System.out.println("회원수정");
		System.out.println("아이디 :"+member.getId());
		System.out.println("비밀번호 :"+member.getPass());
		System.out.println("이름 :"+member.getName());
		System.out.println("나이 :"+member.getAge());
		
	}
	// 회원정보 DB 삭제 delete
	public void deleteMember(String id) {
		System.out.println("회원삭제");
		System.out.println("아이디 :"+id);
	}
	
	// 회원정보 DB 조회 select
	public Member selectMember(String id) {
		System.out.println("회원조회");
		// lee, p567, 이길동, 10 디비에 데이터 조회
		Member member2=new Member();
		System.out.println("주소:"+member2);
		member2.setId("lee");
		member2.setPass("p567");
		member2.setName("이길동");
		member2.setAge(10);
		
		return member2;
	}
	
}
