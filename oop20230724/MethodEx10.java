package oop20230724;

public class MethodEx10 {
	
	public static double circleArea() {
		return 3.14 * 1 * 1; 
	}
	public static double circleArea(int r) {//메서드 오버로딩
		return 3.14 * r * r; 
	}
	public static double circleArea(double r) {//메서드 오버로딩
		return 3.14 * r * r; 
	}

	public static void main(String[] args) {
		/*==="메서드 오버로딩(meThod overLoding)"===
		 * -메서드 중복 정의
		 * -(한 클래스"내"에서)
		 * -메서드명은 같고,
		 * 매개변수의 갯수 또는 자료형이 다른경우
		 * 
		 */
		System.out.println("반지름" + 1 + "인 원의 넓이 : " + circleArea(1));
		System.out.println("반지름" + 2 + "인 원의 넓이 : " + circleArea(2));
		System.out.println("반지름" + 2.4 + "인 원의 넓이 : " + circleArea(2.4));

	}

}
