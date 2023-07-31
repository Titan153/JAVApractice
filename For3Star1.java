package oop20230713;

public class For3Star1 {

	public static void main(String[] args) {
		//중첩 for문 : 사각형(5x5) 별 출력
		 /* 
		 
		 [결과]
		 *****
		 *****
		 *****
		 *****
		 *****
		  
		 */
		for(int i=0; i<5; i++) {         //외부(고정): 행(줄)
		   for(int j = 0; j < 5; j++) {  //내부(변화): 열(칸)
		      System.out.print("*");//25회 실행
		   }//for j end
	     System.out.println();
	     }//for i end
	}//main()end

}//class()end
