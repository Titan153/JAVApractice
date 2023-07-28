package oop20230717;

public class Array3 {
	
	public static void main(String[] args) {
		//프로그램 기본 알고리즘 : 최솟값(min)과 최댓값(max)
		           //0 1 2 3 4 번째(인덱스) 
		int[] num = {7,3,1,8,6};
		//          num[0]  num[4]
		
		//최소값
		//int min = Integer.MIN_VALUE;
		int min = 999; 
		//int min = num[0];
		for(int i = 0; i < num.length; i++) {
			if(min > num[i])
				min = num[i];//현재의 최솟값 변경(갱신)
		}
		
		//최대값
		//int max = Integer.MAX_VALUE;
		int max = num[0];  //int max = -999;
		for(int i = 0; i < num.length; i++) {
			if(max < num[i])
				max = num[i];  //현재의 최대값 변경(갱신)
		}
		
		System.out.println("최소값:" + min);
		System.out.println("최소값:" + max);
		
		
		
		
		System.out.println("최솟값: " + min);
		//System.out.pringln("최대값: " + max);

	}//main()end

}//class()end
