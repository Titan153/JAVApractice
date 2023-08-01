package oop20230720;

public class MethodEx6 {
	
	public static int square(int a){
		return a*a;	
	}
	public static int square(int a,int b){
		return a*b;	
	}
	public static double square(double a,double b){
		return a*b;	
	}
	public static void main(String[] args) {
		// 클래스명(파일명) : MethodEx6.java
		// 다음의 main() 메서드가 실행되어
		// [결과]와 같이 출력되도록,
		// 정사각형과 직사각형의 넓이를 구하는
		// square 메서드를 정의(작성)하시오. (오버로딩)
		//System.out.println("정사각형의 넓이 : "+square());//안됨
		System.out.println("정사각형의 넓이 : "+square(5));
		System.out.println("정사각형의 넓이 : "+square(5,6));
		System.out.println("직사각형의 넓이 : "+square(10, 15));
		System.out.println("직사각형의 넓이 : "+square(1.7, 2.5));
	}//main()end

}//class()end

/*
 * 
 */
