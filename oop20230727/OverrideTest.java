package oop20230727;
//오버로딩 vs 오버라이딩

//    부모class
class School {
	public String name = "학교";
	public void disp() {
		System.out.println(this.name);
	}
	//오버로딩
	public void disp(int a, int b) {
		System.out.println(this.name + a + "반" + b + "반복");
	}
}//class end

//중학교class는 학교class이다.
//학교class는 중학교class이다.  (IS-A관계, 일반화 관계)
//    자식 class			  부모class	
class MiddleSchool extends School {
	
}
class HighSchool extends School{
	public String name = "고등학교"; // 필드 : 지역(화)변수
	//오버라이딩(Overriding), 재정의 
	public void disp() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println("메소드 오버라이딩 : 변경/추가/수정 가능");
	}
	public void disp(int grade) {//오버로딩(Overloading),중복정의
		System.out.println(this.name + grade + "학년");
		
	}
}
public class OverrideTest {

	public static void main(String[] args) {
		MiddleSchool ms = new MiddleSchool();
		System.out.println(ms.name);//학교
		ms.disp();//학교
		
		HighSchool hs = new HighSchool();
		System.out.println(hs.name);		//고등학교
		hs.disp();		// 27번 메서드 호출 : 동적 바인딩(Binding)<==다형성
		hs.disp(1);		// 32번 메서드 호출 
		hs.disp(3, 5); 	// 14번 메서드 호출
		

	}

}
