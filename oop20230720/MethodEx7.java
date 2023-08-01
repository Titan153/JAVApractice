package oop20230720;

import java.util.Scanner;

public class MethodEx7 {

	public static void main(String[] args) {
		// 클래스명(파일명) : MethodEx7.java
		// 다음의 main() 메서드가 실행되어​
		// [결과]와 같이 출력되도록,
		// input 메서드와 sum 메서드와 output 메서드를
		// 정의(작성)하시오.
		// input  메서드 : 매개변수 1차원 배열에 5개 요소의 값을 입력받음
		// sum 메서드 : 매개변수 1차원 배열의 각 요소의 누적 합계를 계산 후 반환
		// output 메서드 : 매개변수 1차원 배열과 누적 합계를 수식으로 출력함
		
		int[] a = new int[5];
		Input(a);
		int b = Sum(a);//int b = 15;
		output(a,b); //output(a,15);
	}//main()end
	public static void Input(int[] a) {// 배열로 받으면 메인메서드에도 그대로 적용되라는 의도로 작성
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("정수를 입력 : ");
			a[i]=sc.nextInt();
		}
		sc.close();
	}
		
	public static int Sum(int[] a) {
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
		
	public static int output(int[] a, int b) {
		
		System.out.printf("%d+%d+%d+%d+%d=%d",a[0],a[1],a[2],a[3],a[4],b);
	    return b; 
	}
	/*
	public static void output(int[] a, int b) {
		//1+ 2+ 3+ 4+ 5=
		for(int i = 0; i < a.length; i++) {
		if (i != (a.length-1)) {
			System.out.print(a[i] + "+");//1+ 2+ 3+ 4+
		}else {
			System.out.print(a[i] + "=");// 5=
		      }
		}
		System.out.println(b);
		*/
}//class()end
