package oop20230726;

import java.util.Scanner;

public class Point {
	
	//필드
	int x = 0;
	int y = 0;
	
	//생성자
	public Point() {
		
		
	}
	public Point(int x, int y) {
		this.x = 0;
		this.y = 0;
		
	}
	
	//메소드 setter,getter
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public void pointDisp() {
        Scanner sc = new Scanner(System.in);
		
		Point p1 = new Point();//p1이라는 객체 생성
		System.out.println("p1의 x 좌표 : ");
		p1.x = sc.nextInt();
		System.out.println("p1의 y 좌표 : ");
		p1.y = sc.nextInt();
		
		Point p2 = new Point();//p2라는 객체 생성
		System.out.println("p2의 x 좌표 : ");
		p2.x = sc.nextInt();
		System.out.println("p2의 y 좌표 : ");
		p2.y = sc.nextInt();
		sc.close();
		
		System.out.printf("p1(%d,%d)와 p2(%d,%d)\n",p1.x,p1.y,p2.x,p2.y);
		
		
		System.out.printf("두점 사이의 거리는 %.2f 입니다.",Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)));
		
		
		
	}

	public static void main(String[] args) {
		// 클래스명(파일명) : Point.java
		// Point 클래스를 정의하시오.
		// 필드 : x좌표와 y좌표로 구성된 점
		// 생성자 : 최초의 x좌표와 y좌표는 0
		// 메서드 : setter와 getter
		// 메서드 : 좌표출력 pointDisp()​​
		/*
		[결과][예]
		p1의 x 좌표: 1 (엔터)
		p1의 y 좌표: 2 (엔터)
		p2의 x 좌표: 3 (엔터)
		p2의 y 좌표: 4 (엔터)
		p1(1,2)와 p2(3,4)
		두 점의 거리는 2.83 입니다.
		*/
	}

}
