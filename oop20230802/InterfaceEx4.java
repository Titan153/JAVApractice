package oop20230802;
//인터페이스를 이용하여, (필수기능)사칙연산을 하는 프로젝트를 생성
//+,-,*,/ 를 구현하는 메소드 원형 4개 선언 : 추상 메서드
//(추가기능)%를 
interface ICalc{
	public abstract int numAdd();
	public int numMin();
	public int numMul();
	public int numDiv();
}
interface ICalc2 {
	public int numMod();
}

class Calc implements ICalc {
	private int x;
	private int y;
	public Calc() {}
	public Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int numAdd() {
		return x + y;
	}
	@Override
	public int numMin() {
		
		return x - y;
	}
	@Override
	public int numMul() {
		
		return x * y;
	}
	@Override
	public int numDiv() {
		
		return x / y;
	}
	
	
}

public class InterfaceEx4 {
	
	public static void main(String[] args) {
		ICalc calc = new Calc(3,5);
		System.out.println(calc.numAdd());
		System.out.println(calc.numMin());
		System.out.println(calc.numMul());
		System.out.println(calc.numDiv());
	}

}
