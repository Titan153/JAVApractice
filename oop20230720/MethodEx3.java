package oop20230720;

public class MethodEx3 {
	
	public static int sign (int n) {
		
		if(n>0) {
		   return 1;
		}
		else{ 
		   return 0;
		   
		}
		
	}//main()end
       
	public static void main(String[] args) {
		// 클래스명(파일명) : MethodEx3.java
		// sign 메소드 : 정수 n을 매개변수로 전달 받아 부호를 판별하여 전달
		// (n이 양수이면 1, 음수이면 0을 return 하도록 하시오.)
		// main() 메소드에서 호출한 sign메소드를 정의하기
		// main() 메소드에서 1이면 "양수"출력, 0이면 "음수"출력
		// (출력결과는 자유롭게 만들어 보세요 ^^)
		int n = 9;
		sign(n);
		
		if(sign(n)==1) {
			System.out.println("양수");
		}
		if(sign(n)==0) {
			System.out.println("음수");
		}

	}//main()end

}//class()end
