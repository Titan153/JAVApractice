package oop20230802;
//클래스간 관계
//1.상속 관계 : 일반화 관계(IS~A ), extends
// 			단일 상속만 지원한다.	
//			하위클래스는 상위클래스 이다.
//		(예) 버스는 차량이다.
//			택시는 차량이다.
class Vehicle {
	public void run() {
		System.out.println("차량은 달립니다.");
	}
}
class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
}
class Taxi extends Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
}
class Driver{
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class PolyTest1 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		bus.run();
		
		Vehicle v1 = new Vehicle();
		v1.run();
		
		Vehicle v2 = new Bus();
		v2.run();	
		
		Vehicle v3 = new Taxi();
		v3.run();
		
		System.out.println();
		driver.drive(new Bus());
		driver.drive(new Taxi());
		//"형변환"(promotion)한 부모인스턴스의 메소드
		driver.drive(v1);
		driver.drive(v2);
		driver.drive(v3);
		
		driver.drive(bus);
		
		 
		
		
		
		

		//driver.drive(bus);
		
		

	}

}//class end
//부모타입 <- 자식타입(Up-casting) : 자동 형변환
//자식타입 <- 부모타입(Down-casting): 명시적 형변환(형변환 생략불가)
