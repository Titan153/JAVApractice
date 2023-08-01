package oop20230801;

import java.util.*;
import java.util.Calendar;

public class StringEx {

	public static void main(String[] args) {
		// 주민번호를 이용해서 아래와 같이 출력하시오.
		//생년월일 : 1989년 12월 30일
		//성별 : 남자
		//나이 : 30
//		                       ->2023-1989
		
		String jumin = "8912301234567";
		int myYear = Integer.parseInt(jumin.substring(0,2));//String "89"를 int 89로 바꾸기위해 wrapper 클래스 사용
		int myMonth = Integer.parseInt(jumin.substring(2, 4));
		int myDate = Integer.parseInt(jumin.substring(4, 6));
		
		//성별코드
		int code =  Integer.parseInt(jumin.substring(6, 7)); //"1" -> 1
		
		//현재 년도
		Calendar now = Calendar.getInstance();
		int cYear = now.get(Calendar.YEAR);//2018
		
		switch(code) {
		case 1:
		case 2: myYear = 1900 + myYear; break;//89 + 1900 -> 1989
		case 3:
		case 4: myYear = 2000 + myYear; break;
		}
		
		//나이
		int myAge = cYear - myYear;
		
		//성별
		String gender = "";
		switch(code%2) {
		case 0 : gender = "여자";break;
		case 1 : gender = "남자";break;
		}
		//띠
		String[] animal = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "벰", "말",	"양"};
		
		//출력
		System.out.println(myYear + "년" + myMonth + "월" + myDate + "일");
		System.out.println("성별 : " + gender);
		System.out.println("(만)나이 : " + (myAge-1));
		System.out.println("(연)나이 : " + myAge);
		//System.out.println(1989%12);
		System.out.println("띠 : " + animal[myYear%12]);//1989%12->9
		
		
	}//main()end

}//class()end
