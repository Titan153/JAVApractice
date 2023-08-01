package oop20230726;

public class Exam {//클래스
    //1.필드
	private String name;
	private int kor, eng, math;
	//2.생성자
	//기본생성자의 모습
    	
	public Exam() {
		//System.out.println("기본 생성자 다녀감");
		this.name = "이름없음";
		this.kor = 100;
		this.eng = 100;
		this.math = 100;
	}
	
	//↓매개변수를 갖는 생성자 근데이름이 같음 : 생성자 오버로딩 //메서드오버로딩처럼 매개변수 갯수와 type을 다르게 해줘야됨
	public Exam(String name) {
		System.out.println("매개변수를 갖는 생성자 다녀감");
		this.name = name;
	}
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Exam(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//Java는 소멸자가 없다.(생성자만 있다.)
	//Java는 가비지 컬렉터(garbage collector)이 동작하므로, delete 명령어가 없다.
	
    //3.메서드
	public void set(String name, int kor, int eng, int math){//매개변수, 지역변수 
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	}
	public void disp() {
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
		System.out.println("수학 : " + this.math);
	}
}//Exam class end
