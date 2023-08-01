package oop20230720;

public class MethodEx5 {
	public static int evenNumber(int n) {
		if(n%2==0) {
			return 1;
		}else {
			return 0;
		}
		//return((n%2==0)?1:0);
	}
	public static void main(String[] args) {
		// 클래스명(파일명) : MethodEx5.java
		// evenNumber(짝수) 메서드 : 매개변수 정수 n을 전달 받아
		// 짝수인지 홀수인지를 검사하는 evenNumber 메서드를 정의하기
		// (n이 짝수이면 1, 홀수이면 0을 return한다.)
		// (출력결과는 자유롭게 만들어 보세요 ^^)
		int n = -9;
		System.out.println(evenNumber(n));

	}//main()end

}//class()end
