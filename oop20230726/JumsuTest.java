package oop20230726;

public class JumsuTest {//실행 클래스

	public static void main(String[] args) {
		//성적 프로그램 : OX표시
		System.out.println("[시험결과]");
		System.out.println("=======================");
		System.out.println("번호 이름 1 2 3 4 5 점수 등수");
		System.out.println("-----------------------");
		
		/*
		Jumsu s1 = new Jumsu(1, "홍길동", 1, 3, 1, 1, 4);
		//s1.compute();
		//s1.disp();
		Jumsu s2 = new Jumsu(2,"최길동", 3,3,3,1,3	);
		//s2.compute();
		//s2.disp();
		Jumsu s3 = new Jumsu(3, "라일락", 2, 3, 3, 4, 1);
		Jumsu s4 = new Jumsu(4, "진달래", 4, 1, 2, 1, 1);
		Jumsu s5 = new Jumsu(5, "봉선화", 1, 1, 2, 3, 4);
		Jumsu s6 = new Jumsu(6, "정장미", 3, 3, 3, 3 ,3);
		*/
		Jumsu[] student = {//객체를 1차원 배열로 만들어서 요소입력
		new Jumsu(1, "홍길동", 1, 3, 1, 1, 4),
		new Jumsu(2, "최길동", 3, 3, 3, 1, 3),
		new Jumsu(3, "라일락", 2, 3, 3, 4, 1),
		new Jumsu(4, "진달래", 4, 1, 2, 1, 1),
		new Jumsu(5, "봉선화", 1, 1, 2, 3, 4),
		new Jumsu(6, "정장미", 3, 3, 3, 3 ,3)
		};
		
		int size = student.length; // student 배열 길이를 지역변수 size로 초기화
		//OX, 점수구하기
		for(int idx = 0; idx < student.length; idx++) {
			student[idx].compute();
		}//for idx end
		//등수 구하기
		for(int a=0; a < size; a++) {
			for(int b = 0; b < size; b++) {
				if(student[a].score < student[b].score) {
					student[a].rank++;
				}//if end
			}//for b end
		}//for a end
		//출력하기
		for(int idx = 0; idx < student.length; idx++) {
			student[idx].disp();
		}
		
	}//main()end

}//class end
