package oop20230725;   //패키지 선언문;

public class Tv {     //클래스 정의//main메소드를 위해서 접근제어자 public
	int channel;//변수선언이지만 클래스 하위에 바로생성되었기 때문에//필드선언: 채널번호	
	void channelUp() {//메서드 : 채널번호 증가하는 기능
		channel++;
	}
	void channelDown(){//메서드 : 채널번호 감소하는 기능
		channel--;
	}
	public static void main(String[] args) {//멤버  //메소드
//	접근제어자       반환타입
		Tv v1 = new Tv();//객체 생성(실행), 인스턴스(객체) //객체생성 4byte 공간이 생겼다
		v1.channel = 7;
		System.out.println("현재 채널 번호 : " + v1.channel);
		v1.channel = 10;
		System.out.println("현재 채널 번호 : " + v1.channel);
		v1.channelUp();
		System.out.println("현재 채널 번호 : " + v1.channel);
		v1.channelUp();
		v1.channelUp();
		System.out.println("현재 채널 번호 : " + v1.channel);
		v1.channelDown();
		System.out.println("현재 채널 번호 : " + v1.channel);
		
		
	}//main()end

}//Tv class()end
