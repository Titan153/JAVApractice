package oop20230801.crud;

public class DtoClass { //Data Transfer Object//계층간 데이터 교환을 위한 객체
						//"책"의 한면(page)//java Bean(특정정보)을 의미
						//getter/setter만 만들어주자
	
	//어떤 데이터를 교환해줄지 먼저 정한다
	private int pageNum;
	private int age;
	private String name;
	private String birth;
	private String address;
	
	public DtoClass() {}//아래에 매개변수 갖는 생성자 있을경우 반드시 생성해줘야됨 default생성자 왜??까먹음
	
	public DtoClass(int pageNum, int age, String name, String birth, String address) {
		super();
		this.pageNum = pageNum;
		this.age = age;
		this.name = name;
		this.birth = birth;
		this.address = address;
	}
	
	@Override //String클래스로 toString 메소드 생성 이유는?
	public String toString() {
			return "DtoClass[pageNum=" + pageNum + ",age =" + age + ",name=" + name + ",birth=" + 
		birth + ",address=" + address + "]";
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	

}
