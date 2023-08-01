package oop20230724;

public class MethodEx9_1 {
	
	public static boolean checkPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}i+=1;//i=i+1;
			j-=1;//j=j-1;
		}
		return true;
	}

	public static void main(String[] args) {
		// 클래스명(파일명) : MethodEx9.java
		// checkPalindrome 메소드
		// 회문(문자열의 앞에서부터 읽으나 뒤에서부터 읽으나 동일한 단어나 구)을 판별할 수 있는 프로그램
		// (예) 회문 : madam, poop
		// [출력]
		// LEVEL은 회문입니다.
		String str = "LEVEL";
		if(checkPalindrome(str))
			System.out.println(str + "은 회문입니다.");
		else
			System.out.println(str + "은 회문아닙니다.");


	}//main()end

}//class()end
