package oop20230802;

import java.util.Scanner;

interface IShape {
	void draw();
	void delete();
	void findArea(double a, double b);
}

class Circle implements IShape{
	
	private double r;
	
	

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}

	@Override
	public void delete() {
		System.out.println("원을 지웁니다.");
	}

	@Override
	public void findArea(double r, double r2) {
		System.out.println("원의 면적 : " + r*r2);
		
	}
	
}

class Rectangle implements IShape{

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public void delete() {
		System.out.println("사각형을 지웁니다.");
	}

	@Override
	public void findArea(double width, double height) {
		System.out.println("사각형의 면적 : " + (width * height));
	}
	
}

public class Interfacetest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 입력하세요(1:원/2:사각형)>");
		int type = sc.nextInt();
		if(type == 1) {
			Circle cir = new Circle();
			System.out.println("원의 반지름 입력: ");
			cir.setR(sc.nextDouble());
			cir.draw();
			cir.findArea(cir.getR(),cir.getR());
			cir.delete();
			
		}
		if(type == 2){
			Rectangle rec = new Rectangle();
			System.out.println("사각형의 가로 입력: ");
			int width = sc.nextInt();
			System.out.println("사각형의 세로 입력: ");
			int height = sc.nextInt();
			rec.draw();
			rec.findArea(width, height);
			rec.delete();
		}
		
		sc.close();
		
	}
}
