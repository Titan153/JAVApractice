package oop20230712;

import java.io.IOException;

public class SelectionEx2_3 {

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
		String result = " ";
		switch(op) {
		case '+':
			result = "더하기";			
			break;
			case '-':
				result = "뺴기";
				break;
			case '*':
				result = "곱하기";
				break;
			case'/':
				result = "나누기";
				break;
				default:
					result = "잘못입력!";
					break;
		}
		System.out.println(result);

	}

}
