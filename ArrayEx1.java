package oop20230717;

public class ArrayEx1 {
	
	public static void main(String[] args) {
		// 클래스명(파일명) : ArrayEx1.java
		// int[] num = { 1, 3, 5, -7, 9, -3, -8, -6, 11, 16, 8 };
		// 음수의 갯수 출력
		
		int[] num = {1, 3, 5, -7, 9, -3, -8, -6, 11, 16, 8};
		//num[3],[5],[6],[7]
		int i = 0;
		int odd = 0;
		
		for(i=0; i < num.length; i++) { 
				if(num[i]<0) {
					odd += 1; //odd+=i; 로 잘못 적어놓고 왜안돼지를 30분넘게 고민..ㅠㅠ
			}
		}
		
		System.out.println("음수의 갯수는 : " + odd + " 개 ");
	}//main()end

}//class()end
