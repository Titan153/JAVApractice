package oop20230712;

import java.util.Scanner;

public class SelectionEx5 {

	public static void main(String[] args) {
		// 클래스명(파일명) : SelectionEx5.java
		// switch 문 이용
		// 주사위 눈금을 입력(1~6), (정수1~6입력 받아)
		System.out.println("주사위 숫자를 입력하세요. :");
		Scanner scanner = new Scanner(System.in);
		int dice = scanner.nextInt();
		
		switch(dice) {
		case 1: case 3: case 5:
			System.out.println("홀수 눈금");
	        break; 	
		case 2: case 4: case 6:
			System.out.println("짝수 눈금");
			break;
			default:
				System.out.println("주사위는 1~6까지의 눈금만 있어요!");
		}
		scanner.close();
		// 홀수, 짝수눈금 구별 (2%!=0, 2%=0)
		// 홀수 이면 "홀수 눈금"
		// 짝수 이면 "짝수 눈금"
		// 나머지는 "주사위는 1~6까지의 눈금만 있어요!" 출력하기

	}

}
