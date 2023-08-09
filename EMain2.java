package com.titanium.aug091.main;

//재귀적 호출(recursive call)
//메소드 속에서 자기 자신(이 메소드)를 또 호출 =>반복

//메소드를 호출 : 느린작업 

//반복문 : ex) 'for'

//기업에서 테스트할 때 이런 알고리즘을 이용해서 내는 경우도 있음!

public class EMain2 {
	//등차수열
	//정수를 하나 넣으면
	//1+2+3+4+...+ 그 숫자까지//1+3+5+7+9....
	//1+(i+1)+(i+1+1)....
	//다 더한 값을 구해주는 메소드
	//add(1) = 1
	//add(2) = 3 =>add(1)+2 => 1 + 2
	//add(3) = 6 =>add(2)+3 => add(1) + 2 + 3 => 1 + 2 + 3
	public static int add(int x) {
		int answer = (x==1)? 1 :(x + add(x-1));
		return answer;
	//	return x*(x+1)/2;
	}
	//정수를 하나 넣으면 factorial값 구하는 함수
	//ex)6! = 720 6*5*4*3*2*1
	//1!=1
	//2!=2 => 2*1
	//3!=6 => 3*2*1
	public static int factorial(int x) {
		int answer = (x==1)? 1 : (x*factorial(x-1));
		return answer;
	}
	
	//피보나치 수열
	//1,1,2,3,5,8,13,21,34,55...
	//메소드의 파라미터로 1이상 정수 넣었을때 => 그 위치에 있는 값 구하기
	public static int fibo(int x) {
		int answer = (x < 3)? 1 :(fibo(x-2)+fibo(x-1));
		return answer;
	}
	
	public static void main(String[] args) {
		int a = add(6);
		System.out.println(a);
		
		int f = factorial(6);
		System.out.println(f);
	}		
}
