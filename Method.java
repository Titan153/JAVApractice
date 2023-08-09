package com.titanium.aug091.main;

import java.util.Scanner;

//메소드(Method)
//관련있는 작업(기능)들을 묶고
//필요할때마다 불러서(호출해서) 사용이 가능

//JDK(자바 개발키트) >JRE(자바 실행환경)
//실행 시 JRE가 OS(운영체제)에 맞춰서 > JVM(자바 가상머신)
//   =>WORA(Write Once Read AnyWhere)-JAVA의 장점!!
//OS별로 프로그램을 만들지 않아도 됨!

public class Method {
//	public static 리턴타입 메소드명(파라미터, 파라미터....) {
		//내용
		//return
//	}
	//리턴타입 : 반환될 값으 자료형
	//메소드내에서 식이 완성되고, main으로 반환할 결과값에 대한 자료형
	//return 이라는 것을 사용해서 반환을 할 것이고, 사용은 이따가..
	
	//메소드명: 말 그대로 이 메소드의 이름
	//1.숫자로 시작하면 =>에러!
	//2.특수문자, 띄어쓰기 =>에러!
	//3.자바문법(예약어)=>에러!
	//_으로 시작해서 에러를 막는 방법도 있음!
	//int_int = 3;
	//java의 문화)
	//4.메소드명을 봐도 무슨 기능인지 알수 있게!
	//5.소문자로 시작
	//6.가독성을 위해서
	//show me the money.
	//뱀체 : show_me_the_money
	//낙타체: showMeTheMoney
	//7.한글 x!
	//변수명 vs 메소드명
	//(명사)	 (동사)
	
	//파라미터(인자, parameter) : 메소드를 실행하는데 필요한 재료
	//필요한 갯수만큼 사용하되, 자료형에 맞춰서 사용해야함!!
	
	//쉬는 날...방에서 게임을 하고있는데... =>어머니가 심부름 시켜요...
	public static void makeErrand() {
		System.out.println("아들~");
		System.out.println("돈 둘테니까");
		System.out.println("슈퍼가서");
		System.out.println("라면이랑");
		System.out.println("참치사고");
		System.out.println("남은 돈 가져와~");
		System.out.println("-----------");
	}
	//어머니가 돈을 주셨다!(돈 = 입력)
	public static int takeMoney() {
		Scanner k = new Scanner(System.in);
		System.out.println("엄마가 준 돈 :");
		int money = k.nextInt();
		System.out.printf("엄마가 %d원을 주셨다\n",money);
		System.out.println("-------------");
		return money;
		//정수(int)에 대한 값을 main메소드에 return, 반화할거니까
		//return type을 int로 선택
	}
	
	//심부름 중에..(라면 : 3200, 참치 : 2170, 과자 : 1500
	//돈이 얼마 남는지 생각...
	public static void doErrand(int money) {
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		//계산하는 메소드
		//계산이라는 작업을 하려면 '받아온 돈' 이 필요!!
		//그 돈은..파라미터로 받아올것!!
		System.out.printf("심부름하면 %d원이 남네...\n", money-(ramen+tuna+snack));
		System.out.println("-------------------");
	}
	//계산을 하고, 잔돈을 어머니에게 주자....
	public static int calculate(int money) {
		int ramen = 3200;
		int tuna = 2170;
		int snack = 1500;
		int bbingddang = 3000;
		
		int restMoney = money - (ramen + tuna + snack + bbingddang);
		return restMoney;
	}
	
	//실행 시 JVM이 main을 자동으로 호출!!
	//이 main도 사실은 메소드의 일종!
	public static void main(String[] args) {
		makeErrand();
		int money = takeMoney();
//		System.out.println(money);
		doErrand(money);
		int restMoney = calculate(money);
		System.out.println(restMoney);
	}
	
	//메소드를 표현하는 4가지 방식!
	//왜?사용할까?
	//기능별로 보기편하도록
	//코드가 길경우에 하나하나 뜯어봐야하는 문제가 생길수 있음
	//보기 편하게
	//오류 발견에 편하게
	//역할 나눔(기능분배)
	//main메소드에 코드를 최대한 짧게 구성하기 위해서
	//기능들을 묶어서 메소드라는 것으로 사용!
	//기능을 나눠서 효율적으로 사용!!
	
	
	
	
	
	
	
}
