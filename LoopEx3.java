package oop20230712;

public class LoopEx3 {

	public static void main(String[] args) {
		// 중첩 for : 피라미드 별(*)출력
		//0행    * 
		//1행   *** 
		//2행  ***** 
		//3행  ******* 
		//4행 *********
		int i,j,x;
		
		for(i = 0; i < 5; i++) {           //외부(고정): 행(줄)
			for(j = 0; j <(4-i); j++ ) {   //내부(변화): 열(칸)
				System.out.print(" ");
		    }
			for(x = 0; x <i*2+1; x++ ) {     //내부(변화): 열(칸)
			    System.out.print("*");	
			}
			System.out.println();
			
	 }//for i() end
		System.out.println("역시 피라미드 만드는건 쉽지않군");
   }//main()end
}//class()end
