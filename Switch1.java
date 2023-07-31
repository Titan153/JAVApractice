package oop20230712;

public class Switch1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 점수 입력받아,
		//총점과 평균을 구한후,
		//평균이 90점 이상 'A'
		//평균이 80점 이상 'B'
		//평균이 70점 이상 'c'
		//평균이 70점 미만 'F'
		int kor = 80;
		int eng = 70;
		int math = 60;
		int total = kor + eng + math;
		double avg = (double)total / 3;
		char grade = ' ';
		//처리(선택):평균 avg로 학점 grade 선택 (1) if(조건식) (2)switch(정수값)
		int average = (int)avg / 10; //(설명) 87.245 ---> 87 ---> 8
		switch(average)
		{
		case 10: 
			grade = 'A';
		case 9: 
			grade = 'A'; break;
		case 8: 
			grade = 'B'; break;
		case 7: 
			grade = 'C'; break;
			default:
				grade = 'F';
				}
		
		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);
		System.out.println("학점:" + grade);

	}

}
