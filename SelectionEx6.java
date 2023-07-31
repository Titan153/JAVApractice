package oop20230712;

import java.util.Scanner;

public class SelectionEx6 {
	
	public static void main(String[] args) {
		// 클래스명(파일명) : SelectionEx6.java
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("아이디를 입력하세요.");
		String idInput = sc.next();
		
		System.out.println("비밀번호를 입력하세요.");
		int pwInput = sc.nextInt();
		
		
		if(idInput.equals("hong")) {
		}if(pwInput == 1234) {
			System.out.println("로그인되었습니다.");
		}
		else{
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
		}
		sc.close();
		}
	
		// 아이디와 비밀번호를 입력 받아서 (문자숫자조합으로 받고싶다)
		// 아이디가 "hong" 이고, 비밀번호가 "1234"이면 "로그인되었습니다."
		// 나머지 "아이디나 비밀번호가 틀렸습니다." 출력하기
	}


