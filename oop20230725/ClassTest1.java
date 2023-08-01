package oop20230725;

class Score{
	private String name;//필드 : 이름
	private int kor,eng,math;//필드 : 국어점수, 영어점수, 수학점수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}
	public void set(String name, int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}//Score class end

public class ClassTest1 {

	public static void main(String[] args) {
		Score s1 = new Score();
		s1.setName("홍길동"); s1.setKor(100);s1.setEng(100);s1.setMath(100);
		s1.disp();
		s1.set("홍길순", 90, 90, 100);
		s1.disp();
		s1.set("홍길순", 70, 60, 100);
		s1.disp();
		
	}

}
