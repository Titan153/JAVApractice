package oop20230706;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		//두 정수의 값을 (콘솔에서)키보드로 입력 받아 
		//합계를 구하여 
		//출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		//선언
		int a = 0;
		int b = 0;
		int c = 0;
		//입력
		System.out.print("첫번쨰 정수: ");
		a = sc.nextInt();
		System.out.println("두번쨰 정수: ");
		b = sc.nextInt();
		
		//처리
		c = a + b;
		//출력
		System.out.println("정수합계 출력: " + c);
		sc.close();
	}

}
