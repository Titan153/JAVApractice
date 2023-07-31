package oop20230710;

public class Operator4 {

	public static void main(String[] args) {
		// 관계연산자:(결과)true,false
		// 논리연산자:(대상, 결과)true, false
		//(NOT,부정) 논리부정연산자:!
		//(AND, 둘다, 그리고) 논리곱 연산자:&&
		//(OR, 둘중하나라도, 또는) 논리 합연산자:||
		System.out.println( !true );
		System.out.println( !false );
		System.out.println();
		System.out.println(false&&false);
		System.out.println(false&&true);
		System.out.println(true&&false);
		System.out.println(true&&true); //(결과)true
		System.out.println();
		System.out.println(false||false);
		System.out.println(false||true); //(결과)true
		System.out.println(true||false); //(결과)true
		System.out.println(true||true); //(결과)true
		System.out.println();
		int month = 7;
		int day = 10;
		System.out.println(month == 7);
		System.out.println(day == 4);
		//조건판별식 : 7월 4일 이니?
		System.out.println((month == 7)&&(day == 4));
		//조건판별식 : 7월이거나 4일이니?
		System.out.println((month == 7)||(day == 4));
		System.out.println(month == 8);
	

	}

}
