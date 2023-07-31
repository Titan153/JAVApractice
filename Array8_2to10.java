package oop20230718;

public class Array8_2to10 {

	public static void main(String[] args) {
		//2진수를 10진수로 변경
		int bin = 1110;
		int dec = 0;
		int digit = 1;
		while(true) {
			if(bin == 0)
				break;
			else {
			dec += (bin % 10) * digit;
			digit *= 2;
			bin /= 10;
			}
		}
		System.out.println("10진수: " + dec);
	}//main()end
}//class()end
