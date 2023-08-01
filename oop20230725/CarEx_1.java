package oop20230725;

class Auto{
	String type;
	String model;
	String color;
	int speed;
	
	public void increaseSpeed() {
		
	}
	
	public void decreaseSpeed() {
		
	}
	public void set(String type, String model, String color, int speed) {
		this.type=type;
		this.model=model;
		this.color=color;
		this.speed=speed;
		
	}
	public void inform() {
		System.out.println(type + "사의 " + model + "의 " + "색상은 " + color + "이며 현재속도는" + speed + "km/h");
	}
	
	
}//Car class end
public class CarEx_1 {

	public static void main(String[] args) {
		// 클래스명(파일명) : CarEx.java
		// Car 클래스를 정의하시오.
		// 필드 : 자동차의 제조사 type
		// 필드 : 자동차의 모델 model
		// 필드 : 자동차의 색상 color
		// 필드 : 자동차의 속도 speed
		// 메소드 : speed를 증가하는 increaseSpeed 메소드
		// 메소드 : speed를 감소하는 반환하는 decreaseSpeed 메소드
		// 메소드 : 자동차의 정보 출력
		/*[결과]
		car1 -> Ford사의 Focus의 색상은 red이며 현재 속도는 30km/h
		car2 -> Toyota사의 Auris의 색상은 blue이며 현재 속도는 50km/h
		car3 -> Volkswagen사의 Golf의 색상은 green이며 현재 속도는 70km/h
		*/
		Auto car1 = new Auto();
		car1.set("Ford", "Focus", "red", 30);
		car1.inform();
		Auto car2 = new Auto();
		car2.set("Toyota","Auris","blue",50);
		car2.inform();
		Auto car3 = new Auto();
		car3.set("Volkswagen","Golf","green",70);
		car3.inform();
		
	}//main end

}//CarEx class end
