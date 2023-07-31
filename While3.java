package oop20230712;

public class While3 {

	public static void main(String[] args) {
		// 중첩 while문 : 구구단 출력하기 (2단~9단) <-- 8회 반복
		int i;
		int j;
		
		i = 2;
		while(i <= 9) {//외부 : 고정반복
			j = 1;
			while( j<=9 ) { //내부 : 변화반복
				System.out.printf("%d x %d = %2d\n", i, j, i*j);
				j++;
			}
			i++;
		}
	}//main()end
}//class ()end
