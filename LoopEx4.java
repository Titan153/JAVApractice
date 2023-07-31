package oop20230712;

import java.util.Scanner;

public class LoopEx4 {

	public static void main(String[] args) {
		// 두 개의 정수를 입력 받아서, 
		Scanner sc = new Scanner(System.in);
		System.out.println("1)정수를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("2)정수를 입력하세요.");
		int j = sc.nextInt();
		int sum = 0;
		
		if(i>j) {
			while(i>=j) {
				sum+=j;
				j++;	///		
		         }
			System.out.printf("두정수 사이 모든 정수의 합은 %d 입니다.", sum);
			System.out.printf("\n정수%d 와 정수%d 사이 모든 정수의 합은 %d 입니다.", i, j, sum);
			//j값이 자꾸 입력값이 안나오고 다른값이나온다
		} else{
			while(j>=i) {
				sum+=i;
				i++;
			}
			System.out.printf("두정수 사이 모든 정수의 합은 %d 입니다.", sum);
			System.out.printf("\n정수%d 와 정수%d 사이 모든 정수의 합은 %d 입니다.", i, j, sum);
			//i값이 자꾸 입력값이 안나오고 다른값이나온다
		}sc.close();
	
		// 입력 받은 두 정수와 그 사이에 존재하는 모든 정수들의 합계를 출력하기
		// (예) 3과 5가 입력되면, 3+4+5 의 계산 결과(12)가 출력
		// 단, 입력되는 숫자의 순서에 상관없이 동일한 결과가 출력되어야한다. 
		// 즉 3과 5가 입력이 되건, 5와 3이 입력이 되건, 이에 상관없이
		// 3+4+5의 계산 결과가 출력되어야 한다.
		
		//j값이 자꾸 입력값이 안나오고 다른값이나온다

	
   
      }//main()end
}//class()end