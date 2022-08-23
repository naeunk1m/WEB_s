package test0719;

public class Member {
	//멤버변수 은닉
	private String id;
	private String pass;
	private String name;
	private String birth;
	private String email;
	private String phone;
	
	//set get
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return this.id;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
