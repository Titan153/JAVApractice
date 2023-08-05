package oop20230803;

import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.print("두 개의 정수 입력 후 나눗셈 하는 프로그램");
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		
		try {
			
			System.out.println("피제수 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("제수 입력 : ");
			int num2 = sc.nextInt();		
			result = num1 / num2; //ArithmeticException 예외 발생 가능
		
		}catch(Exception e1) {
			System.out.println("제수는 0을 입력할수 없습니다.");
		}finally {
			System.out.println("프로그램이 정상 종료되었습니다.");//무조건 실행
		}
		/*
		if(num2==0) {	//if문 이용하여 예외 처리
			System.out.println("제수는 0을 입력할 수 없습니다.");
			System.out.print("제수 입력: ");
			num2 = sc.nextInt();
		}
		*/
		//System.out.println("정수 나눗셈의 결과 : " + result); //(추후 변경 요망)
		//System.out.println("프로그램이 정상 종료되었습니다.");//무조건 실행
		
	}

}
