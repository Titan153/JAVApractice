package oop20230713;

public class For3Star6 {

	public static void main(String[] args) {
		//목표 별모양
		//     *
		//    **
		//   ***
		//  ****
		// *****
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}//for(i)end
	
		
		
		
		
		
		
		
	}//main()end

}//class()end
