package oop20230727;

public class Exam12 {

	public static void main(String[] args) {
		//    참조변수     객체
		Exam1 ex1 = new Exam1("홍길동",90,90,90);
		ex1.outputResult();
		//자식 참조변수      자식객체
		Exam2 ex2 = new Exam2("김철수", 80, 80, 80, 80, 80);
		ex2.outputResult();
	}

}
