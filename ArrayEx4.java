package oop20230717;

import java.util.Scanner;

public class ArrayEx4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요.");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			System.out.println( "배열의" + i + "번째요소");
			array[i] = sc.nextInt();
		} sc.close();
		
		int sum = 0;
		for(int i =0; i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("배열의 합계 : " + sum);
		
		// 클래스명(파일명) : ArrayEx4.java
		// int형 1차원 배열에 크기(size)를 (키보드로)입력 받아
		// 각 배열요소의 값입력 후
		// 배열 요소의 합계 출력
		// - for문 이용
		// - (예) 4를 입력하면 10,20,30,40을 입력 후 90을 출력
        //3을 입력하면 10,-50,30을 입력 후 -10을 출력
		// [HINT] int size = 10;
        //int[] num = new int[size];
		//[결과][예]
		//배열의 크기 : 4 (엔터)
		//0번째 요소 : 10 (엔터)
		//1번째 요소 : 20 (엔터)
		//2번째 요소 : 30 (엔터)
		//3번째 요소 : 40 (엔터)
		//배열 요소의 합계 : 90
		
	}

}
