package oop20230717;

public class ArrayEx3 {
	
	public static void main(String[] args) {
		// 클래스명(파일명) : ArrayEx3.java
		// int[] num = { 1, 3, 5, -7, 9, -3, -8, -6, 11, 16, 8 };
		// num[2] 요소값의 등수 출력
		
		int[] num = { 1, 3, 5, -7, 9, -3, -8, -6, 11, 16, 8 };
		
		int[] rank = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[i] < num[j]) {
					rank[i]++;
				}
			}//for j end
				
		}//for i end
		System.out.println(num[1] + "점은 " + rank[1] + "등 입니다.");
		
		
	}//main()end

}//class()end
