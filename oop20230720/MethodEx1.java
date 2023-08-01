package oop20230720;

public class MethodEx1 {
	
	public static boolean leapYear(int year) {
		if ((year%4 == 0) && (year%100 !=0)||(year%400==0)) 
			return true;
		else return false;
	}
	

	public static void main(String[] args) {
		int count = 0;
		for(int year = 1; year <= 2023; year++) {
			if(leapYear(year)) {
				count++;
			}
			
		}
		System.out.println("서기 1년에서 서기 2023년 까지 윤년 : "+ count );	
		// 클래스명(파일명) : MethodEx1.java
		// 서기 1년에서 2023년(포함) 까지의 윤년의 갯수를 출력하는 프로그램
		// 다음과 같은 main() 메서드가 실행되도록 leapYear 메서드를 정의하시오.

				

	}//main()end

}//class()end
