package oop20230725;

class Car{
	String type;
	String model;
	String color;
	int speed;
	
	public int inreaseSpeed() {
		return speed++;
	}
	public int decreaseSpeed() {
		return speed--;
	}
	public void carinform(String type, String model, String color, int speed) {
		System.out.printf("%s사의 %의 색상은 %s이며 현재 속도는 %dkm/h\n",type,model,color,speed);	
	}
	
}//Car class end
public class CarEx {

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
		Car car1 = new Car();
		car1.type = "Ford";
		car1.model = "Focus";
		car1.color = "red";
		car1.speed = 30;
	    
		
		Car car2 = new Car();
		car2.type = "Toyota";
		car2.model = "Auris";
		car2.color = "blue";
		car2.speed = 50;
		
		Car car3 = new Car();
		car3.type = "Volkswagen";
		car3.model = "Golf";
		car3.color = "green";
		car3.speed = 70;
		
		
	}//main end

}//CarEx class end
