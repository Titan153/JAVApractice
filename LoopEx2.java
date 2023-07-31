package oop20230712;

public class LoopEx2 {

	public static void main(String[] args) {
		// 클래스명(파일명) : LoopEx2.java
		// 1 ~ 10 사이의
		// 짝수 합계와 홀수의 합계를 출력하기 2%=0, 2%!=0
		int i = 1;
		int evenSum = 0; //even number : 짝수
        int oddSum = 0; //odd number : 홀수
		
		while( i <= 10) {
			if( i % 2 == 0 ) {
				evenSum += i;
			 }else {
			   oddSum += i;	
			}
			i++;
		  }
			System.out.printf("짝수 합계: %d, 홀수 합계: %d", evenSum, oddSum);
		}
	}
