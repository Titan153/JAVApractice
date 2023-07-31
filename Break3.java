package oop20230717;

import java.util.Scanner;

public class Break3 {
	public static void main(String[] args) {
		//정수를 "계속해서"입력 받고 <--- 무한 Loop
		// 입력받은 정수가 0이면, 반복을 끝내고,
		//입력한 정수(number)의 합계(total)를 출력하세요.
		
		int number;
		int total = 0;
		Scanner sc = new Scanner(System.in);//sc는 참조변수
		
		while(true) {
			System.out.print("정수 입력(0 - 종료) :  ");
			number = sc.nextInt();//sc는 참조변수
			
			if(number == 0)//무한반복 탈출
				break;     //while end 로 제어이동
			
			total += number;
			
		}//while end
		
		System.out.println("총 합계 : " + total);
		
	}//main()end

}//class()end

//무한반복 : "계속해서 반복" 반복용제어변수 없음
//유한반복 <-- 무한반복 +단순if문{break;}
