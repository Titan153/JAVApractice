package oop20230724;

public class RectEx {		//실행 클래스

		public static class Rect{
			int width=3;
			int height=5;
			
		}//class rect end
		public static int round(int width,int height) {
			return (width+height)*2;
		}
		public static int area(int width,int height) {
			return (width*height);
		}
		

		public static void main(String[] args) {
			// 클래스명(파일명) : RectEx.java

			// Rect 클래스를 정의하시오.
			// width 필드 : 사각형의 가로 길이
			// height필드 : 사각형의 세로 길이
			// round() 메소드 : 사각형의 둘레를 반환 기능
			// area()메소드 : 사각형의 넓이를 반환 기능

			//[결과]
			//가로 길이 3cm, 세로 길이 5cm인 사각형의
			//둘레는 16cm이고, 넓이는 15cm2입니다.
			Rect rt = new Rect();
			System.out.printf("가로의 길이 %dcm, 세로의 길이 %dcm인 사각형의 둘레는 %dcm이고,넓이는 %dcm2 입니다",rt.width,rt.height,round(3,5),area(3,5));

	}//main()end

}//class RectEx() 
