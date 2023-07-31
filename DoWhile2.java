package oop20230713;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// 계속 키보드(사용자)로부터 입력받은 정수를 출력하여라.
		//(단,0이 입력되면 실행중지)
		int num;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("숫자를 입력해주세요!(0입력시 종료) : ");
			num = sc.nextInt();
			
			System.out.println("입력 숫자 : " + num);
						
		} while (num != 0); sc.close();
		
	}//main()end

}//class()end
//[+]교재 : 109page(1~10까지의 합계구하기)<-----while
//[+]교재 : 112page(1~10까지의 합계구하기)<-----Do while