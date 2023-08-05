package oop20230802;

abstract class Parent{				//(대부분)추상 클래스는 부모역할만 한다.
	String name = "부모";				//필드
	abstract void view();			//추상 메서드(선언문;)(바디블럭이없다)->자식클래스에서 해당 오버라이드 메서드바디 만들어줘야됨
	void line() {					//일반 메서드
		System.out.println("---");	
	}
}
//	  자식 클래스    "추상"부모클래스
class Son extends Parent {
	//추상 (부모) 클래스를 상속(extends)받은 자식 클래스는 
	//반드시!(must) 꼭! 부모 추상 메서드를 오버라이드 해야만 한다.
	@Override
	void view() {
		System.out.println("아들");
	}
	
	
}

public class AbstractEx1 {

	public static void main(String[] args) {
		//추상(부모) 클래스를 상속받은 자식 클래스만 객체 생성 가능!
		//추상(부모) 클래스는 new 객체(인스턴스) 생성 불가능!
		//Parent papa = new Parent();//(에러)
		
		
		Son son = new Son();
		son.line();
		son.view();
		
	}

}

//추상클래스 : 주로 부모 역할
//추상메서드가 1개 이상이 있으면 추상클래스가 된다.
//추상메서드 : 메서드의 body{} 가 없다. -> 메서드 header;
//추상클래스 : 일반 메서드 포함 가능, 추상 메서드 포함 가능
//추상클래스 : 추상메서드(1개 반드시) + 일반메서드s
//인터페이스 : 추상메서드만 구성되어 있음
