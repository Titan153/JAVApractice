package oop20230712;

import java.util.Scanner;

public class SelectionEx4 {

	public static void main(String[] args) {
		// 클래스명(파일명) : SelectionEx4.java
		System.out.println("현재 몇월 입니까?");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 2 :
		case 3 :
			System.out.println("1사분기.");
			break;
		case 4 : 
		case 5 : 
		case 6 :
			System.out.println("2사분기.");
			break;
		case 7 :
		case 8 :
		case 9 :
			System.out.println("3사분기.");
		    break;
		case 10 :
		case 11 :
		case 12 :
			System.out.println("1사분기.");
			break;
		default:
			System.out.println("잘못 선택했어요.");
			
		
		}
		sc.close();
		
		
		// switch 문 이용

		// 월을 입력 받아 해당하는 사분기 출력

		// 1, 2, 3월 : 1사분기,

		// 4, 5, 6월 : 2사분기,

		// 7, 8, 9월 : 3사분기,

		// 10, 11, 12월 : 4사분기,

		// 나머지 : 잘못 선택했어요.
	}//main()end

}//class()end
