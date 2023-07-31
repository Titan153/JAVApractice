package oop20230712;

import java.util.Scanner;

public class SelectionEx3 {

	public static void main(String[] args) {
		// 클래스명(파일명) : SelectionEx3.java
		
		// if 문 이용
		System.out.println("날짜를 입력하세요: ");
		// 날짜를 입력 받아서
		int day = 0;
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		// 날짜가 1 ~ 10일 : 초순,
		if((day <= 10)&&(day >= 1)) {
			System.out.println("초순");
		} else if ((day > 10)&&(day < 20)) {
			System.out.println("중순");
		} else if ((day > 20)&&(day < 32)) {
			System.out.println("하순");
		} else {System.out.println("잘못 입력했습니다!");
		
		}
		sc.close();
	}//main()end
}//class()end
		// 11~20일 : 중순, 

		// 21~31일 : 하순, 

		// 나머지 : 잘못 입력하였습니다 출력
	


