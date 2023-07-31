package oop20230712;

import java.io.IOException;

public class SelectionEx2_2 {

	public static void main(String[] args) throws IOException {
		// switch 문 이용
		// +, -, *, / 를 입력 받아서
		// + 이면 "더하기"
		// - 이면 "빼기"
		// * 이면 "곱하기"
		// / 이면 "나누기"
		// 그 이외는 "잘못 입력!" 출력하기
		System.out.println("산술연산자를 입력하세요.(+, -, *, /):");
		char op = (char)System.in.read();
		
		switch(op) {
		case '+':
			System.out.println("더하기");			
			break;
			case '-':
				System.out.println("뺴기");
				break;
			case '*':
				System.out.println("곱하기");
				break;
			case'/':
				System.out.println("나누기");
				break;
				default:
					System.out.println("잘못입력!");
					break;
		}

	}

}
