package oop20230719;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// 클래스명(파일명) : Change.java
		// 동전 거스름돈 프로그램
		// 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산 12340원 = 12340/500 
		// 변수 money의 금액을 동전으로 바꾸었을 때
		// 각각 몇 개의 동전이 필요한지 계산하여 출력
		// 단, 가능한 한 적은 수의 동전으로 거슬러주도록 함
		// int[] coinUnit = { 500, 100, 50, 10 };
		// [HINT] /연산자와 %연산자 사용
		/*[결과]

		금액(money) 입력(원) : 3870 (엔터)

		500원 : 7개

		100원 : 3개

		50원 : 1개

		10원 : 2개
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("금액(money) 입력(원) : ");
		int money = sc.nextInt();
		
		int[] coinUnit = { 500, 100, 50, 10 };
		int mok = 0;
		int change = 0;
		
		for(int i = 0; i < coinUnit.length; i++) {
		System.out.printf("%d원 %d개 \n",coinUnit[i], (money/coinUnit[i]));
		money = money % coinUnit[i];//이걸 한참고민했습니다. money 변수이용하는걸..money%=coinUnit[i];
		}
		sc.close();
		
		
		
		
		

	}//main()end

}//class()end
