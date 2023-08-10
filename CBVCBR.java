package com.titanium.aug101.main;


//면접문제
//Call By Value, Call By Reference

//Call BY Value : 변수의 '값'을 복사해서 메소드의 파라미터값으로 사용하는것
//Call By Reference : 변수를 참조하는 주소값(번지값)을 파라미터로 전달하는것

public class CBVCBR {
	public static void test(int a, int[] b,int[]c) {
		System.out.println("b(green)" + b);		//번지값
		System.out.println("c(green)" + c);		//번지값
		System.out.println(a + "a(green)");		//10
		System.out.println(b[0] + "b(green)");	//10	
		System.out.println(c[0] + "c(green)");	//10
		System.out.println("----------------");	
		
		a=100;
		b[0] =100;
		c = new int[] {100,200};
		
		System.out.println("b(green)" + b);		//번지값
		System.out.println("c(green)" + c);		//번지값(달라짐)
		System.out.println(a + "a(green)");		//100
		System.out.println(b[0] + "b(green)");	//100
		System.out.println(c[0] + "c(green)");	//100
		System.out.println("----------------");
		
		
	}
	public static void main(String[] args) {
		int a = 10;
		int[]b = {10, 20};
		int[]c = {10, 20};
		System.out.println("b(red)"+b);		// 번지값
		System.out.println("c(red)"+c);		// 번지값
		System.out.println("-------------");
		test(a,b,c);
		System.out.println("-------------");
		System.out.println(a + "a(red)");	//10
		System.out.println(b[0] + "b(red)");//100
		System.out.println(c[0] + "c(red)");//10
	}
}
//Java에서 파라미터를 넘기는 과정에서 직접적인 참조를 넘긴게 아닌,
//주소값을 복사해서 넘기기 떄문에 이것은Call By Value이다.
