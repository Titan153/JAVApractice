package oop20230711;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// int 변수를 키보드로 3개(x, y, z) 입력 받아 가장 큰 값(max) 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("x는:");
		int x;
		x = sc.nextInt();
		System.out.println("y는:");
		int y;
		y = sc.nextInt();
		System.out.println("z는;");
		int z;
		z = sc.nextInt();
		
		String max = " "; 
		max = (x>y)? "x" :(y>z)? "y" : "z";
		System.out.println(max);
		// 클래스명(파일명) : MaxNum.java

		// - 삼항 연산자 만으로 구현하기!!!
		sc.close();
	}//main()end

}//class()end
