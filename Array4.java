package oop20230717;

public class Array4 {
	
	public static void main (String[] args) {
		//프로그램 기본 알고리즘 : 배열요소값 2개 SWAP(교환)
		int num1 = 30;
		int num2 = 50;
		int temp;
		System.out.println("교환전:" + num1 + " " + num2 );
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("교환후:"+ num1 + " "+ num2);
		
		int[] num = {30, 50};
		System.out.println("교환전: " + num[0] + " " + num[1]);
		temp = num[0];
		num[0]=num[1];
		num[1]=temp;
		System.out.println("교환후" + num[0] + " " + num[1]);
		
	}//main()end

}//class()end
