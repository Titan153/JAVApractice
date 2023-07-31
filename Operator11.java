package oop20230711;

//import java.util.Scanner;

public class Operator11 {

	public static void main(String[] args) {
		// 조건연산자의 10의 짝수 (2의 배수) 판별 : 82page 변형
		// 삼항 연산자와 %연산자 활용
		
		// int변수를 키보드로 임의의 값을 입력 받아
		//그 값이 [2의 배수]이거나/또는/OR/||[3의 배수]인지를 판별
		//2의 배수 이거나 3의 배수이면, 1을 출력
		//그렇지 않으면 0을 출력
		//Scanner sc = new Scanner(System.in);
		int num = 6;
		//int result = 999;
		int result;
		//[조건식]
		//1출력하니?
		//num가 2의 배수이니?
		result = (num%2 == 0)||(num%3 == 0) ? 1 : 0;
		System.out.println(result);

	}

}
