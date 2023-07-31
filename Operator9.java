package oop20230711;

public class Operator9 {

	public static void main(String[] args) {
		// 정수 연산: %, &, ^, |, ~, <<, >>, >>>
		// 비트 shift 연산자: << , >> , >>>
		System.out.println(14<<2);//56
		System.out.println(14>>2);//3 00001110
		System.out.println(14>>>2);//3
		//<<: padding bit는 무조건 0
		//>>: (양수)padding bit는 무조건 0
		//>>>: padding bit는 무조건 0
		
		System.out.println(-4>>2);//1
		System.out.println(-4>>>2);//1073741823

	}

}
