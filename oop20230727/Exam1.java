package oop20230727;

public class Exam1 extends Object{
	String name;
	int kor, eng, math;
	int tot;
	double avg;
	public Exam1() {	}
	public Exam1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int calcTot() {
		this.tot = kor + eng + math;
		return this.tot;
	}
	public double calcAvg() {
		this.avg=(double)tot/3;
		return this.avg;
	}
	public void outputResult() {
		System.out.println("이름: " + name + " 총점: " + calcTot() + " 평균: " + calcAvg());
	}
	
}
