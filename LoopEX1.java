package oop20230712;

import java.util.Scanner;

public class LoopEX1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오. >");
		int input = sc.nextInt();
		int sum = 0;
		while(input!=0) {
			sum += input%10;//sum = sum+input%10
			System.out.printf("sum = %d input = %d\n",sum,input);
			input/=10;//input = input/10
		}
		System.out.println("각 자리수의 합:" + sum);
		
				// 클래스명(파일명) : LoopEx1.java
				// 정수를 입력받아서
				// 각 자리의 합계를 출력하기
				// 나누기연산자(/), 나머지연산자(%), while문 사용
				//[결과]
				//정수를 입력하시오. > 12345 (엔터)
				//자릿수 합계 : 15
		sc.close();
	}
	
}
