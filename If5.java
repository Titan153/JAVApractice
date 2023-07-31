package oop20230712;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {
		System.out.print("이용약관에 동의하겠습니까?(Y)es/(N)o=>");
		///3열에 import 직접 타이핑 안해도 Scanner ctrl + space 로 자동완성하면 들어옴
		Scanner sc = new Scanner(System.in);
		String agree = sc.nextLine();
		
		//관계(비교)연산자 (<,<=, >, >=, ==, !=)는 기본자료형에서 비교가능)
		//String 참조형에서는 주소 비교
		//"문자열" 내용비교 ==> String 클래스의 equals()메소드 이용
		//if(agree.equals("Y") == true)//if(agree == "Y")//판별 불가능
		if(agree.equals("Y"))
			System.out.println("동의하였습니다.");
		else
			System.out.println("동의하지 않았습니다.");
		
		sc.close();

	}

}
