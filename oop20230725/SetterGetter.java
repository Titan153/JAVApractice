package oop20230725;

class AAA{
	
	public int x; //(사용자정의 자료형)"클래스"필드 
	private int y; //"클래스"필드 : 정보은닉
	
	public void setY(int n) {//메서드 : setter
		y = n;
	}
	public int getY() {//메서드 : getter      //private Y가 int 타입
		return y;
	}
}//AAA class end

public class SetterGetter {//실행 클래스

	public static void main(String[] args) {  //main() 메서드 : 프로그램 실행의 시작
		int a; //메소드 안에 있기떄문에 필드(field)x, "메서드"지역 변수(local variable)
		a = 10;
		System.out.println(a);
		
		//AAA aa;		//참조변수 선언문;
		//new AAA();  //객체 생성
		AAA aa = new AAA();
		System.out.println(aa);//aa가 가리키는 주소가 출력된다
		aa.x = 10; //public 멤버 : 외부접근 가능
		System.out.println(aa.x);//public 멤버 : 외부접근 가능
		aa.x = 10;
		System.out.println(aa.x);//public 멤버 : 외부접근 가능
		
		System.out.println(aa.getY());
		aa.setY(20);			 //public 멤버 : 외부접근 불가능
		System.out.println(aa.getY());//public 멤버 : 외부접근 불가능
	}

	
	
}//class end

/*접근제어자 : public > protected > private
         "공개"                 "비공개"(정보은닉)
=====메서드명과 기능 =====
set~~~ : 필드값 설정, setter, return문 없음, 인수 있음
get~~~ : 필드값 반환, getter, return문 있음, 인수 없음
is~~~~ : 판별 가능, return true;또는 return false;
init~~~: 필드값 초기화, (최초1번) 사용을 위해 만드는 메서드
===변수/필드/메소드/클래스 명(식별자) 명명 규칙===
-의미있는 이름 부여하기
-영문 대소문자와 숫자를 혼용하여 작성
-단, 숫자는 첫글자 사용 불가능
-특수문자 사용 불가능(단, _ 과 $ 가능)
-공배문자 포함 불가
-예약어(키워드) 사용불가능
===권장사항===
-클래스:(반드시)첫글자 대문자, _,$로 명명해야 한다.
-변수/필드/메소드 : 소문자로 시작 (파스칼 표기법)
-합성어의 첫글자는 대문자
-cf)final int PI = 3.14;
*/
