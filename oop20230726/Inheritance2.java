package oop20230726;
//Java에서는 모든 클래스는 상속 받았음
//(Java에서는 모든 클래스가 Object클래스의 하위클래스 이다.)
//Java의 최상위 클래스는 Object 클래스

class Korea extends Object{ //부모 클래스
	//필드
	//생성자
	public Korea() {  			//부모의 기본 생성자
		System.out.println("korea()---");
	}
	//메서드
}
class Seoul extends Korea{
	
	public Seoul() {			//자식의 기본 생성자		
		super();//Korea();이지만 생성자 같은 이름으로 못부름 
		System.out.println("Seoul()---");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		Seoul seoul = new Seoul(); //자식객체 생성--(동시에)-->(부모 기본생성자 갔다가 -->자식생성자) 생성자 자동호출
		
	}

}//Inheritance2 class end
