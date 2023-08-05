package oop20230802;

interface School{
	public abstract void setJumsu(int kor, int eng);	//추상 메서드(필수기능)
	public abstract void print(); // 추상메서드(필수기능)
}
class Sungjuk implements School{
	private int kor;	//인스턴스 필드
	private int eng;	//인스턴스 필드
	
	@Override
	public void setJumsu(int kor, int eng) {	//인스턴스 메서드
		this.kor = kor;
		this.eng = eng;
	}
	@Override
	public void print() {	//인스턴스 메서드
		System.out.println("===성적증명서===");
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
	}
	
	public void line() {//인스턴스 메서드
		System.out.println("------------");
	}
}
public class InterfaceEx3 {
	
	public static void main(String[] args) {
		//(에러) 인터페이스는 new 객체(인스턴스 생성 불가능)
		//School sch = new School;
		
		Sungjuk hong = new Sungjuk();
		hong.setJumsu(50, 70);
		hong.print();
		//인터페이스도 다형성 지원한다!
		School sch = new Sungjuk();
		sch.setJumsu(60, 60);
		sch.print();
		//sch.line();		//(에러)
		
		
	}

}
