package oop20230712;

public class While1 {
	
	public static void main(String[] args){
		
		int i;//변수 i: 반복용 제어변수 (0,1,2,3,4)
		
		i = 0; //초기화, 시작값
		while(i < 5)//while(i <= 4) //끝//6회
			{//true :5회
			System.out.println((i+1) + "번쨰 : " + "Hi,Java"); //참_ 반복대상(5회)
			i ++; //i = i + 1;//증감식      //5회
		}
		System.out.println("최종 i: " + i);
		System.out.println("반복횟수: " + i);
		
		
	}
}
