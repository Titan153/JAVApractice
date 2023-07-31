package oop20230712;

import java.util.Scanner;

public class SelectionEx1 {

	public static void main(String[] args) {
		
		String gender = "";
		
		System.out.println("성별을 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		gender = sc.next();
		char a = gender.charAt(0);
		
		if(a == 'M'){
			System.out.println("남자.");
		} else if(a == 'F'){
		    System.out.println("여자.");
		} else { 
			System.out.println("잘못 입력했습니다!");
		}
		
		// 성별을 입력받아서

		// M 이면 "남자이시군요"

		// F 이면 "여자이시군요"

		// 나머지는 "잘못 입력했습니다!" 출력하기
		sc.close();
	}//main()end

}//class()end
