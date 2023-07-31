package oop20230712;

import java.util.Scanner;

public class SelectionEx7 {
	
	public static void main(String[] args) {
		// switch 문 이용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("+, -, *, /, % 중 하나를 고르세요: ");
		String op = sc.next();
		
		
		System.out.println("실수 x를 입력하세요. :");
		double x = sc.nextDouble();
		
		System.out.println("실수 y를 입력하세요. :");
		double y = sc.nextDouble();
		
		
		switch(op) {
		case "+": System.out.println(x + y);
			break;
			
		case "-": System.out.println(x - y);
			break;
			
		case "*": System.out.println(x * y);
			break;
			
		case "/": System.out.println(x / y);
			break;
			
		case "%": System.out.println(x % y);
			break;
			
		}
		
		
		// 산술연산자 중 하나를 선택하게 하고, +, -, *, /, %
		// 실수 두 개를 입력 받아서
		// +을 선택했으면 두 수 더하기
		// -을 선택했으면 두 수 빼기
		// *을 선택했으면 두 수 곱하기
		// /을 선택했으면 두 수 나누기
		// %을 선택했으면 두 수의 나머지를 구하여 결과값 출력 하기
	sc.close();
	}

}
