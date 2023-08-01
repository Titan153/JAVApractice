package oop20230727;

public class ScoreAgain {
	//필드 : 배열이 있는 경우
	private int[] subject;
	//생성자
	public ScoreAgain() {}				//생성자를 오버로딩할때 기본생성자 만들어놓고 오버로딩 하는거 적극 추천
	public ScoreAgain(int[] subject) {	//매개변수 생성자
		this.subject = subject;
	}
	//메서드 getter, setter 메서드
	public int[] getSubject() {
		return subject;
	}
	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	//총점, 평균을 구하는 메서드
	public int calSum() {
		int sum = 0;
		for(int i = 0; i < subject.length;i++) {
			sum += subject[i];
		}
		return sum;
	}
	public double calAverage() {
		return (double)calSum()/subject.length;
	}
			
	

}//class end
