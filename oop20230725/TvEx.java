package oop20230725;

class Tv1 {//클래스 정의
	int channel;	
	void channelUp() {
		channel++;      //필드의 내부접근
	}
	void channelDown(){
		channel--;		//필드의 내부접근
	}
}//Tv1 class end

public class TvEx {//실행클래스 //자바 소스 파일 : TvEx.java //public 둔이유는 main메소드 떄문에     
	
	public static void main(String[] args) {

		Tv v1 = new Tv();
		System.out.println("현재 채널 번호 : " + v1.channel); //필드의 외부접근
		v1.channel = 10;  //필드의 외부접근
		System.out.println("현재 채널 번호 : " + v1.channel); //필드의 외부접근
		v1.channelUp();	  //메서드의 외부접근 	
		System.out.println("현재 채널 번호 : " + v1.channel); //필드의 외부접근
		v1.channelUp();   //메서드의 외부접근
		v1.channelUp();	  //메서드의 외부접근
		System.out.println("현재 채널 번호 : " + v1.channel); //필드의 외부접근
		v1.channelDown();//메서드의 외부접근
		System.out.println("현재 채널 번호 : " + v1.channel); //필드의 외부접근
		
		
	}//main()end

}//Tv class()end
