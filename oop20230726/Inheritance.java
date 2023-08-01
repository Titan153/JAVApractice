package oop20230726;

class AA{ //BB입장에서 AA는 부모/상위/super/기본(base) 클래스
	//필드
	//생성자
	//메서드
	public void one(){
		System.out.println("one()---");
	}
	public void two() {
		System.out.println("two()---");
	}
}//class AA end

//(상속)IS-A 관계(is a relationship), 일반화 관계
//class 자식클래스명 extends 부모클래스명 { }
class BB extends AA{ //자식/하위/sub/파생(derived) 클래스
	/*
	 * public void one(){
	 *  	System.out.println("one()---");
	 * }
	 * public void two(){
	 * 		System.out.pinrtln("two()---");
	 * }
	 */
	 public void three() {
		 System.out.println("three()---");
	 }
}//class BB end
class CC extends BB{}
class DD extends AA{}
//(에러)JAVA 언어에서 단일상속만 가능하다!
//class EE extends AA,BB {}


public class Inheritance {//실행클래스
	
	public static void main(String[] args) {
		AA aa = new AA(); 	//부모 객체생성--->생성자 자동호출
		aa.one();
		aa.two();
		//aa.three(); //(에러) 부모객체가 자식객채 기능 사용X
		
		BB bb = new BB(); 	//자식 객체생성--->생성자 자동호출
		bb.one();
		bb.two();
		bb.three();
		
		CC cc = new CC();	//자식 객체생성--->생성자 자동호출
		cc.one();
		cc.two();
		cc.three();
		
		DD dd = new DD();	//자식 객체생성--->생성자 자동호출
		dd.one();
		dd.two();
		
	}//main()end

}//class end
