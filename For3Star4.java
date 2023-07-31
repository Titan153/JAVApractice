package oop20230713;

public class For3Star4 {

	public static void main(String[] args) {
		//중첩 for문 : 삼각형(5x5) 별 출력
		 /* 
		 
		 [결과]
		 i(행)         (열)n($)       j(열)0~(4-i)이하
		 ----------------------------------------
		 0행$$$$*(엔터) (4회)0~4(4-0)  (1회)0~0(+1)
		 1행$$$**(엔터) (3회)0~3(4-1)  (2회)0~1(+1)
		 2행$$***(엔터) (2회)0~2(4-2)  (3회)0~2(+1)
		 3행$****(엔터) (1회)0~1(4-3)  (4회)0~3(+1)
		 4행*****(엔터) (0회)0~0(4-4)  (5회)0~4(+1)
		  
		 */
		for(int i = 0; i < 5; i++) {         //외부(고정): 행(줄)
		   for(int n = 0; n < (4-i); n++) {  //내부(변화): 열(칸)
		      System.out.print("$");//25회 실행
		   }//for n end
		   
		   for(int j = 0; j < i+1; j++) {  //내부(변화): 열(칸)
			      System.out.print("*");//25회 실행
		   }//for j end
		   
		   
	     System.out.println();
	     }//for i end
	}//main()end

}//class()end
