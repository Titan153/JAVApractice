package oop20230720;

public class MethodEx2 {

	public static void guGU(int n) {
		
		for(int i = 1; i <= 9;i++) {
			
			System.out.println(n + "*" + i + "=" + (n*i)+ " ");	
		}
		//return;(반환 타입이 void이기때문에 리턴생략가능)
	}
	
	public static void main(String[] args) {
		
		int n = 7;
		guGU(n);
		// 클래스명(파일명) : MethodEx2.java
		// guGu 메소드 : 정수 n을 매개변수로 전달 받아 구구단 중 n단을 메서드 안에서 출력
		// main() 메소드에서 호출한 guGu 메소드를 정의하기
		// (출력결과는 자유롭게 만들어 보세요 ^^)

	}

}
