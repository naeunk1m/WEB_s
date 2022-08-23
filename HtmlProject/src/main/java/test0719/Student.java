package test0719;

public class Student {
	//멤버변수 num name kor eng math 
	// private 데이터 은닉 캡슐화
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//생성자 생략 => 기본생성자 자동으로 만들어짐
	public Student() {	}
	
	//객체 생성할때 값을 받아서 멤버변수 초기값 할당 
	public Student(int num,String name,int kor,int eng,int math) {
		this.num=num;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	// 멤버변수에 값을 받아서 저장하는 메서드 set
	public void setNum(int num) {
		this.num=num;
		return;
	}
	public void setName(String name) {
		this.name=name;
		return;
	}
	public void setKor(int kor) {
		this.kor=kor;
		return;
	}
	public void setEng(int eng) {
		this.eng=eng;
		return;
	}
	public void setMath(int math) {
		this.math=math;
		return;
	}
	
	// 멤버변수의 값을 가져가는 메서드 get
	public int getNum() {
		return this.num;
	}
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	
	
	//메서드
	// prn() 내용출력 메서드
	public void prn() {
		System.out.println(num+","+name+","+kor+","+eng+","+math);
		return;
	}
	// sum() return 
	public int sum() {
		return kor+eng+math;
	}
	// avg() return
	public double avg() {
		return (kor+eng+math)/3.0;
	}
}
