package oop20230802;

class Unit {
	int currentJP;
	int x;
	int y;
}//class end

interface Moveable {
	void move(int x, int y);
}//interface end

interface Attackable {
	void attack(Unit u);
}//interface end

interface Fightable extends Moveable, Attackable{
	//인터페이스는 상속(extends)이 가능하다.
	
}//interface end

class Fight extends Unit implements Fightable{
	@Override
	public void move(int x, int y) {
		
	}
	@Override
	public void attack(Unit u) {
		
		
	}
}

public class InterfaceEx2 {
	
	public static void main(String[] args) {
	/* java에서는 다중상속 불가능하다.
	 * 인터페이스와 클래스 간의 상속 및 구현
	 * java에서는 "다중상속"을 인터페이스(간 상속으로) 구현한다.
	 * #인터페이스와 다중상속
	 * 인터페이스 : 구현 implements
	 * 추상클래스 : 상속 extends
	 * java는 다중상속 불가능하다.
	 * 다중구현은 가능하다.	
	 */
	}

}
