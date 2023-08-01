package oop20230720;

public class MethodEx4 {
	
	public static int isUpper(char n) {
		if((n>='A')&&(n<='Z')) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// 클래스명(파일명) : MethodEx4.java
		// isUpper 메서드 : 매개변수로 문자를 전달 받아 
		// 대문자이면 1, 그렇지 않으면 0을 return 하는 isUpper 메서드를 정의하기
		// [HINT] 대문자의 범위 (ch>='A') && (ch<='Z')
		// (출력결과는 자유롭게 만들어 보세요 ^^)
		char n = 'A';
		System.out.println(isUpper(n));
				

	}//main()end

}//class()end
