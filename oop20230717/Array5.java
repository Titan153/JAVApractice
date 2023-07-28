package oop20230717;

public class Array5 {
	
	public static void main(String[] args) {
		//프로그램 기본 알고리즘 : 등수/순위/ranking 구하기
		
		//선언, 입력
		int[] score = {30, 90, 80, 50, 70};
		//30점이 몇등인지 알고싶다.(고정)
		//1. 90과 비교해본다.
		//2. 80과 비교해본다.
		//3. 50과 비교해본다.
		//4. 70과 비교해본다.
		//다른 수도 이방식으로비교		
		int[] rank  = { 1,  1,  1,  1,  1};
		//처리 : 등수구하기
		for(int i = 0; i < score.length; i++) {//등수를 구하는 대상(위치)
			for(int j = 0; j < score.length; j++) {//비교 횟수(5회 씩)
				if(score[i] < score[j] )
					rank[i]++;//rank[i] = rank[i] + 1;			
			}//(j)for end
		}//(i)for end
		
		
		//출력
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]+"점은 "+rank[i]+"등 입니다.");
			
		}
        
	}//main()end

}//class()end
