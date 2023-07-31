package oop20230717;

public class ArrayEx2 {
	
	public static void main(String[] args) {
		// 클래스명(파일명) : ArrayEx2.java
		// int[] num = { 1, 3, 5, -7, 9, -3, -8, -6, 11, 16, 8 };
		// 양수 중 짝수의 합계 출력
		int[] num = {1, 3, 5, -7, 9, -3, -8, -6, 11, 16, 8};
		int i = 0;
		int evenSum = 0;
		for(i = 0; i < num.length; i++) {
			if(num[i] > 0 && num[i]%2==0) {
				evenSum += num[i];	
			}
			
		}//for i end
		System.out.println("짝수의 합은 "+ evenSum + "입니다.");
	}//main()end

}//class()end
