package oop20230718;

public class dice {
	
	public static void main(String[] args) {
		//난수 생성(1): 주사위 (1,2,3,4,5,6)굴리기
		//난수, 랜덤값, 무작위수
		//Math.random() 메소드
		//클래스.메소드()
		//Math.random()
		//Returns a " double value" with a positive sign,
		//greaterthan or equal to 0.0 and less than 1.0
		//반환값 >= 0.0 && 반환값 < 1.0
		
		//0.0이상 1.0미만 사이의 난수 생성
		System.out.println(Math.random());
		//RUN할때마다 다른 값 나온다
		//0이상 10미만 사이의 난수 생성
		System.out.println((int)(Math.random()*10) );
		//0이상 100미만 사이의 난수 생성
		System.out.println((int)(Math.random()*100) );
		//0이상 5미만 사이의 난수 생성
		System.out.println((int)(Math.random()*5));
		//0이상 6이상 사이의 난수 생성
		System.out.println((int)(Math.random()*6+1));
	
	}//main()end

}//class()end
