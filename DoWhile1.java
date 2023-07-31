package oop20230713;

public class DoWhile1 {

	public static void main(String[] args) {
		//7단 구구단 출력하기 (곱셈 수식 9회 출력)
		int i = 1;
		int val = 7;
		
		i = 100;
		do {
			System.out.printf("%d x %d = %2d\n", val, i, val*i);
			i++; 
		} while(i <= 9);
		       
//= while : 한번도 반복대상을 수행하지 않을수 있다.(반복횟수 : 0회 이상)
//= do~while : 반드시 한번은 반복대상을 수행한다.(반복횟수 : 1회 이상)
	}//main()end

}//class end
