package oop20230711;

import java.util.*;

public class If3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력:");
		int num = sc.nextInt();
		if(num%2 == 0)       //조건식: num은 짝수 이니?
		{
			System.out.println("짝수입니다.");//참_실행문;
		}
		else        
		{//if(num%2 != 0)
			System.out.println("홀수입니다.");//거짓_실행문;
		}
		sc.close();
	}//main()end

}//class()end
