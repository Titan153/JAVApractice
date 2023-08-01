package oop20230725;

class Time{
	int hour;
	int minute;
	int second;
	
	public int setHour() {
		return hour;
	}
	public int setMinute() {
		return minute;
	}
	public int setSecond(){
		return second;
	}
	public void getTime() {
		System.out.print("현재 시간은 " + setHour() + "시 " + setMinute()+"분 " + setSecond() + "초");
		
	}
}


public class TimeEx {

	public static void main(String[] args) {
		// 클래스명(파일명) : TimeEx.java
		// Time 클래스를 정의하시오.
		// 필드 : 시 hour
		// 필드 : 분 minute
		// 필드 : 초 second
		// 메소드 : 시간 설정하는 setHour 메소드
		// 메소드 : 분 설정하는 setMinute 메소드
		// 메소드 : 초 설정하는 setSecond 메소드
		// 메소드 : 시분초 출력하는 getTime 메소드
		//[결과]
		//현재 시간은 12시 50분 30초입니다.
		Time time = new Time();
		time.hour=12;
		time.minute=50;
		time.second=30;
		time.getTime();
		
		

	}

}
