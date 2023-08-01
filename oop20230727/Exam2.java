package oop20230727;
//       자식("3" +2필드)     부모클래스(1+3+1+1 필드)
public class Exam2 extends Exam1{
	int mus, com;
	public Exam2() {}
	public Exam2(String name, int kor, int eng, int math, int mus, int com) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.mus = mus;
		this.com = com;
	}
	//오버라이드 : 부모 메서드를 재정의
	public int calcTot() {
		this.tot = kor + eng + math + mus + com;
		return this.tot;
	}
	//오버라이드 : 부모 메서드를 재정의
	public double calcAvg() {
		this.avg=(double)tot/3;
		return this.avg;
	}
	
}//class end
