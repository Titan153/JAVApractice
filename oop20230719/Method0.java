package oop20230719;
// 클래스
public class Method0 {
	//클래스(class) : {필드(field)s + 메서드 (method)s}
	//멤버변수 : 필드, 속성
	//멤버함수 : 메서드, 기능, 함수(function)
	public static void main(String[] args) {  // 메서드의 헤더
		//메서드의 바디(구현)
		//Scanner 클래스 : 표준입력관련 클래스 > .nextInt()
		//Math 클래스 : 수학관련 클래스 > .random()
		//calender 클래스 : 날짜관련 클래스
		
		//절대값
		System.out.print(Math.abs(-3));
		//큰값
		//System.out.println((5>7)? 5 : 7);
		System.out.println(Math.max(5, 7));
		//작은값
		System.out.println(Math.min(5, 7));
		//2의 3승
		System.out.println(Math.pow(2, 3));
		//3개의 정수 중 큰값
		System.out.println(Math.max(3, Math.max(5, 7)));
		
		//난수(무작위, 랜덤수) : 시스템이 발생시킨 값, random값
		//난수 발생 범위 : 0.0 이상에서 1.0 미만 사이의 실수	
		System.out.println(Math.random());
		System.out.println(Math.random()*2);
		System.out.println((int)(Math.random()*2)); //0,1
		System.out.println((int)(Math.random()*3)); //0,1,2
		System.out.println((int)(Math.random()*4)); //0,1,2,3
		//주사위 수 범위 : 1,2,3,4,5,6,
		System.out.println((int)(Math.random()*6)); 
		//0,1,1,2,3,5 까지 밖에 안나오기떄문에 주사위 할떄는 + 1
		//로또 범위 : 1이상 45이하
		System.out.println((int)(Math.random()*45+1));
		
		System.out.println(Math.ceil(1.2));//2.0올림
		System.out.println(Math.ceil(-1.2));//-1.0올림
		System.out.println(Math.floor(3.6)); // 3.0 내림
		System.out.println(Math.floor(-3.6));// -4.0내림
		System.out.println((int)3.6);//3
		System.out.println(Math.round(3.6)); // 4반올림
		System.out.println(Math.round(-3.6));//-4반올림
		
	}//main()end

}//class()end
