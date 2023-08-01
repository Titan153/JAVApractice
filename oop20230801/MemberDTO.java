package oop20230801;

public class MemberDTO { //MemberVO
	
	//DTO(Data Transfer Object)
	//VO(Value Object)
	
	//1.field
	private String id; //id
	private String passwd;//비번
	private String uname;//이름
	private String email;//이메일
	private String phone;//전화번호
	private String address;//주소
	private String wdate;//등록일
	//2.construct
	public MemberDTO() {}
	//3.getter,setter method
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	//4.method : toString()
	@Override
	public String toString() {
		return "MemberDTO[id=" + id +  ",passwd=" + passwd + ", uname=" + uname + ",email=" + email + ",phone="
				+ phone + ",address=" + address + ",wdate" + wdate + "]";
	}
	

}//class()end
