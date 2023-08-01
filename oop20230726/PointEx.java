package oop20230726;


public class PointEx {

	public static void main(String[] args) {
		
		// 클래스명(파일명) : PointEx.java
		// PointEx 실행 클래스를 작성하시오.
		// 두 점(객체) p1과 p2를 생성한 후
		// 각각의 좌표값을 입력받아 
		// 두 점 사이의 거리를 구하여
		// 출력하시오.
		// [HINT]
		// - 피타고라스의 정리 //(a*a)+(b*b)=(c*c)
		// - Math.sqrt() 메소드 : 제곱근(루트) //(a*a)+(b*b)값을 Math.sqrt()에 대입하면 나올거같은데...
		/*
		[결과][예]
		p1의 x 좌표: 1 (엔터)
		p1의 y 좌표: 2 (엔터)
		p2의 x 좌표: 3 (엔터)
		p2의 y 좌표: 4 (엔터)
		p1(1,2)와 p2(3,4)
		두 점의 거리는 2.83 입니다.
		*/
		Point point = new Point();
		point.pointDisp();
	}

}
