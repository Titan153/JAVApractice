package oop20230712;

import java.util.Scanner;

public class SelectionEx2 {

	public static void main(String[] args) {
		// switch 문 이용
		System.out.println("+, -, *, / 중 하나를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		String operator = " ";
		operator = sc.next();
		char a = operator.charAt(0);
		
		switch(a) {
		case '+': 
			System.out.println("더하기");
				break;
		case '-': 
			System.out.println("빼기");
		        break;
		case '*' : 
			System.out.println("곱하기");
		        break;
		case '/':
			System.out.println("나누기");
		        break;
		default:
			System.out.println("잘못 입력!");
		}
		sc.close();
		// +, -, *, / 를 입력 받아서

		// + 이면 "더하기"

		// - 이면 "빼기"

		// * 이면 "곱하기"

		// / 이면 "나누기"

		// 그 이외는 "잘못 입력!" 출력하기
	}//main()end

}//class()end
