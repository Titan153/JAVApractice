package oop20230705;

public class VariableEx3 {

	public static void main(String[] args) {
		//클래스명(파일명) : variableEx3.java
		//국어, 영어, 수학 점수가
		//100점, 25점 ,84점일떄.
		//3과목의 총점(total)과 평균(avg1)을 구하여
		//출력하시오.
		//0. 변수 선언
		int kor = 100; //변수 kor : 국어점수
		int eng = 25;  //변수 eng : 영어점수
	    int math = 84; //변수 math : 수학점수
	    
		//1. 입력
		
		//2. 처리
		int total = kor + eng + math;
	    int avg1 = (kor + eng + math) / 3;
	    double avg2 = total / 3; 
	    double avg3 = (double)total / 3;
	   
		//3. 출력
		
	        
	    System.out.println("국어" + " " + kor + "점");
	    System.out.println("영어" + " " + eng + "점");
	    System.out.println("수학" + " " + math + "점");
	
	    System.out.println("3과목의 총점" + " " + total + "점");
	    System.out.println("평균점수" + " " + avg1 + "점");
	    System.out.println("평균점수 " + avg2);
	    System.out.println("평균점수 " + avg3);//double 은 소수점 15자리까지 보여준다 (메모리는 건드리지않음)
	    System.out.printf("평균점수: %f\n", avg3); //float 은 소수점 6자리까지 보여준다(메모리는 건드리지않음)
	    System.out.printf("평균점수: %.2f\n", avg3);//%.2 에서 2는 소수점 둘쨰자리까지만 표시해라
	    
	    //update
	    System.out.println("총점: " + (kor + eng + math));
	    System.out.println("평균: " + (kor + eng + math)/3);
	    System.out.println(209/3);
	    System.out.println(69*3);
	    System.out.println(209%3);
	    

	}

}
