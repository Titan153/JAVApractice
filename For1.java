package oop20230713;

public class For1 {

	public static void main(String[] args) {
		//7단 구구단 추력하기 (곱셈 수식 9회 출력)
		int i = 1;
		int val = 7;
		
		for (i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", val, i , val*i);
		}

	}//main() end

}//class() end
