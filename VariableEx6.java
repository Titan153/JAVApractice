package oop20230706;

public class VariableEx6 {

	public static void main(String[] args) {
		// (두 정수의 값을) 교환(swap)하는 알고리즘
		//변수 대입문(대입연산자 =)을 이용한 방법
		int x = 10;
		int y = 20;
		int temp;
		System.out.println("교환전 > x:" + x + " " + "y: "+ y);
		//System.out.printf("교환전 > x: %d y: %d\n", x, y );
		
		//대입연산(=)을 이용한 교환 처리
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("교환후 > x: " + x + " " + "y: " + y);
		
		//main() end
		

	}

}
