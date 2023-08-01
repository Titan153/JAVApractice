package oop20230724;

class Rect2{
	int width;
	int height;
	
	public int round() {
		return (width + height)*2;
	}
	public int area() {
		return (width * height);
	}
}//Rect class end

public class RectEx_2 {

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
		Rect2 rt = new Rect2();
		rt.width = 3;
		rt.height = 5;
		System.out.println("가로 길이 " + rt.width + "cm, 세로 길이 " + rt.height + "cm");
		System.out.println("둘레는 " + rt.round() + "cm이고, 넓이는" + rt.area() + "cm2 입니다." );
		

	}

}
