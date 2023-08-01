package oop20230724;

public class MethodEx4 {
	//isUpper 메서드 : 매개변수로 문자를 전달 받아
			//대문자이면 1, 그렇지 않으면 0을 return 하는 isUpper메서드를 정의하기
			//[HINT]대문자의 범위(ch>='A')&&(ch<='Z')
	public static int isUpper(char ch) {
		if ((ch>='A')&&(ch<='Z'))
			return 1;
		else
			return 0;
		
	}

	public static void main(String[] args) {
		//isUpper 메서드 : 매개변수로 문자를 전달 받아
		//대문자이면 1, 그렇지 않으면 0을 return 하는 isUpper메서드를 정의하기
		//[HINT]대문자의 범위(ch>='A')&&(ch<='Z')
		//'한문자'를 대문자인지 판별하는 프로그램
		char c = 'S';
		if(isUpper(c)==1) {
			System.out.println("대문자");
		}else {
			System.out.println("소문자");
		}

	}

}
