package oop20230711;

import java.util.Scanner;

public class Operator12 {

	public static void main(String[] args) {
		//char 변수를 키보드로 (단일)문자를 입력받아
		//그 값이 대문자 인지를 판별하여
		//대문자이면 "입력완료"를 출력
		//그렇지 않으면 "입력오류"를 출력
		//삼항(조건) 연산자
		Scanner sc = new Scanner(System.in);
		char ch =  ' '; //변수 ch: 키보드 입력(단일문자)
		String s = ""; //변수 s: 출력 결과 문자열(여러문자들)
		//입력
		System.out.print("한 문자 입력: ");
		String input = sc.nextLine();
		ch = input.charAt(0);
		//처리
		//여기만 완성하기!! 할수있으면,ok
		s = (ch >= 'A')&&(ch <= 'Z')? "입력완료" : "입력오류";
		//s = ((ch>=65)||(ch<=102))? "입력완료" : "입력오류"; 대문자 int로 숫자코드 범위를 만들어서 표현가능할까
		//출력
		System.out.println("결과:" + s);
		
		//#Scanner 클래스를 이용한 한 문자 입력
	    //[코드1]char ch = '';
		//ch = sc.next().charAt(0);
		//[코드2]
		//String input = sc.nextLIne();
		
	
		
		
		sc.close();

	}//main()end

}//class() end
