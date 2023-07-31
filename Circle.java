package oop20230710;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
	        //// 반지름를 입력받아

			// 둘레와 넓이를

			// 출력하시오. (파이는 3.14)
			//선언
		int radius = 0;
		double length = 0.0;
		double area = 0.0;
		final double PI = 3.14; //final은 변수의 상수화(반드시 초기화문에 한번만),뒤에 변수 PI가 나와도 값이 못바뀌게 final을 씀
		Scanner sc = new Scanner(System.in);
			//입력
		System.out.println("반지름 입력:");
		radius = sc.nextInt();
		    //처리(연산)
		    //PI = 1.1; final 없을떄는 바꿔서 써놔도 에러가 없다 그래서 final을 써야한다
			//둘레
		length = 2.0 * PI * radius;
			//넓이
		//area = PI * Math.pow(area, PI) (radius, 2);
		// area = PI * radius * radius;
			//출력
		System.out.println("원의 둘레: " + length);
		System.out.println("원의 넓이: %.2f\n" + area);
		sc.close();
	}

}
