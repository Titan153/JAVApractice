package oop20230801;

class School extends Object{
	String name = "학교";
	String address = "주소";
	public School() {}
	public School(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.address);
		
	}
	
}//school class end

class MiddleSchool extends School{
	public MiddleSchool() {}
	public MiddleSchool(String name, String address) {
//		super();
//		super.name = name;
//		super.address = address;
		super(name, address);
	}
	@Override
	public void disp() {
		System.out.println("===MiddleSchool===");
		System.out.println(this.name);
		System.out.println(this.address);
	}
	
}//MiddleSchool class end

class HighSchool extends School{
	int friend;
	public HighSchool() {}
	public HighSchool(String name, String address) {
		super(name, address);
	}
}//HighSchool class end

public class PolyTest {

	public static void main(String[] args) {
		MiddleSchool ms1 = new MiddleSchool();
		ms1.disp();//동적 바인딩 : 오버라이딩된 disp()메서드 호출
		MiddleSchool ms2 = new MiddleSchool("행복중학교", "서울시");
		ms2.disp();//동적 바인딩 : 오버라이딩된 disp()메서드 호출
		
		HighSchool hs1 = new HighSchool("사랑고등학교","경기도");
		hs1.disp();//동적 바인딩 :  School disp() 메서드 호출
		
		//1.업캐스팅(upcasting)
		//:자식 객체(인스턴스)를 부모형 클래스 참조변수에 대입할 수 있다.
		//부모 참조변수        자식 객체(인스턴스);
		//School sch1 = (School)new MiddleSchool("믿음중학교", "제주도");
		School sch1 = new MiddleSchool("믿음중학교","제주도");
		sch1.disp();//동적 바인딩(Dynamic Binding) : 오버라이딩된 disp()메서드 호출
		
		
		//2.다운캐스팅(downcasting)(강제형변환): 업캐스팅된 객체를 다시 원상대로 되돌리는 형변환
		
		School sch2 = new MiddleSchool("부모중학교", "강원도");
		MiddleSchool ms3;
		//ms3 = sch2;//(에러)(해결)다운캐스팅 처리 해준다.
		ms3 = (MiddleSchool)sch2;
		ms3.disp();
		
		//부모타입 <- 자식타입(Up-casting) : 자동 형변환
		//자식타입 <- 부모타입(Down-casting): 명시적 형변환(형변환 생략불가)
		
		
	}//main end

}//class end
