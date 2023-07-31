package oop20230706;

import java.util.Scanner;

public class Squar {

	public static void main(String[] args) {
		// // 가로(width)길이와 세로길이(height)를 키보드로 입력받아(Scanner 클래스를 사용)

		// 둘레(round)와 넓이(area)를

		// 출력하시오.
		//선언
		Scanner sc = new Scanner(System.in);
		int width;
		int height;
		//입력
		System.out.println("가로는 :");
		width = sc.nextInt();
		System.out.println("세로는 :");
		height = sc.nextInt();
		//연산
		System.out.println("둘레는 :" + ((width + height ) * 2));
		System.out.println("넓이는 :" + (width * height));
		sc.close();
	}

}
