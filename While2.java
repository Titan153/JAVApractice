package oop20230712;

public class While2 {

	public static void main(String[] args) {
		//7단 구구단 출력하기(곱셈 수식 9회 출력)
		int i = 1; //변수 i: (1)반복횟수 (2)곱해지는 수 (1~9, +1)
		int val = 7;
		
		while(i <= 9) {//while(i < 10)
			System.out.printf("%d x %d = %d\n" , val, i, val*i);
			i++;
			
		}//while end
	}//main()end

}//class end

/*
 * 구구단 출력 : 7단(반복제어변수 i:9회) ----> 0~8(+1), "1~9(+1)"
 * 
 * val i   val*i
 * ----------------------
 * 7x1=7
 * 7x2=14
 * 7x3=21
 * 7x4=28
 * 7x5=35
 * 7x6=42
 * 7x7=49
 * 7x8=56
 * 7x9=63
 * 
 */
 
