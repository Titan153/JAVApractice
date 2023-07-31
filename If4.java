package oop20230712;

public class If4 {

	public static void main(String[] args) {
		// 다중 if : if~else if~else
		int number = -5;
		
		if(number < 0) {
			System.out.println("음수입니다.");//실행문1;
		}else if(number > 0) {
			System.out.println("양수입니다.");//실행문2;
		}else {
			System.out.println("0입니다.");//실행문3;
		}//정확히 3가지 기준으로 나누는게 아니라면 마지막 else문은 조건이 없어도됨

	}

}
