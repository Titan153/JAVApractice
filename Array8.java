package oop20230718;

public class Array8 {
	
	public static void main(String[] args) {
		//진법변환(10진수 -> 2진수)
		int dec = 14; //(입력) 10진수(14):0~11111111(2진수 최대값)
		
		int[] bin = new int[8];//(출력) 2진수 00001110
		//int[] bin = {0,0,0,0,0,0,0,0,};
		
		int i = 7;	 //int i = bin.length-1
		while(dec > 0) {
			bin[i--] = dec % 2;  //처리방향: <=====
			//i = i - 1;
			dec/=2; //dec = dec / 2;//다음번스텝에 나머지를 구하기 위한 준비
			
		}
		
		for(int j = 0; j < bin.length; j++) { //출력방향: ======>
			System.out.print(bin[j]);
		}
		
		
	}//main()end

}//class()end
//2진수를 10진수로 변경하는 방법도 고민해보기