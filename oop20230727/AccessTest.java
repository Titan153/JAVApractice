package oop20230727;

import oop20230726.*;								//패키지명.클래스; <--클래스 포함하기 위한 포함문;
import oop20230726.Account;

class A {
	int a;
	public int b;
	protected int c;
	private int d;
	void show() {
		System.out.println(a);		//default 필드 내부 접근 가능
		System.out.println(b);		//public 필드 내부 접근 가능
		System.out.println(c);		//protected 필드 내부 접근 가능
		System.out.println(d);		//private 필드 내부 접근 가능
		
	}
}//class end
class B extends A {

	@Override
	void show() {
		System.out.println(a + 10);//default 필드 외부(부모)접근 가능
		System.out.println(b + 20);//public 필드 외부(부모)접근 가능
//		System.out.println(d + 40);//private 필드 외부(부모)접근 불가능
		System.out.println(c + 30);//protected 필드 외부(부모) 접근 가능
	}
}




public class AccessTest {// 외부 (실행) 클래스

	public static void main(String[] args) {
		A objA = new A();
		objA.a = 10;			   	//default 필드 외부 접근 가능 	
		System.out.println(objA.a);	//default 필드 외부 접근 가능
		objA.b = 100;
		System.out.println(objA.b);	//public 필드 외부 접근 가능
		objA.c = 1000;				//protected 필드 외부 접근 가능
		System.out.println(objA.c);	//protected 필드 외부 접근 가능
//		objA.d = 10000;				//(에러)private 필드 외부 접근 불가능	
//		System.out.println(objA.d);	//(에러)private 필드 외부 접근 불가능 
		
		B objB = new B();
		objB.a = 1;
		System.out.println(objB.a);//default 필드 외부 접근 가능
		objB.show();
		
		Account accObj = new Account();
		accObj.setName("홍길동");
		System.out.println(accObj.getName());
	}

}
//#교재 : 167page , 238page(protected)
/*===접근제어자(제한자)===
 * -클래스,필드,매서드,생성자
 * public > protected > default > private
 * 1)private : 같은 클래스 내에서만 접근 가능
 * 2)default(생략형) : 같은 패키지 안에 있은 클래스끼리만 접근 가능
 * 3)protected : 같은 패키지 접근 가능
 * 			     상속 관계가 있으면 다른 패키지 접근 가능
 *               (상속 받은 자식 클래스에서 접근 가능)
 * 4)public : 어디에서나 접근 가능(다른 패키지에서도)
 */
