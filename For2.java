package oop20230713;

public class For2 {

	public static void main(String[] args) {
		//중첩 while문: 구구단 출력하기(2단~9단)<-- 8회
		int i;
		int j;
		
		for(i = 2; i <= 9; i++ ) {
		  for(j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d\n" , i, j, i*j);
				
			} 
		    
		}

	}//main() end

}//class end
//[주말과제]교재: 123page(Q4,Q5)
