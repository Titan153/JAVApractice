package oop20230712;

public class While4 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=9) {
			System.out.println("7 x " + i + " = " + (7*i));
		}
	
	}

}
//while문(반복횟수: 0회 이상)
//- 특정 조건식의 결과가 true(반복조건이 참)인동안 반복 수행
//-while내부의 블록에서 조건이 거짓이 되도록 만들면 LOOP를 빠져 나오게 해야함
//-처음부터 조건이 false이면 반복블록 실행되지 않음:(반복횟수: 0회 이상)