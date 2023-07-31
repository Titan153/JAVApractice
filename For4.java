package oop20230713;

public class For4 {

	public static void main(String[] args) {
		// 프로그래밍 기초 알고리즘 : 갯수와 누적
		//(1) 1(이상)~10(이하)의 짝수의 갯수 출력 
		//프로그래밍 기초 알고리즘 : 누적(합계), 누적곱
		int count = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0)
			count++; /// count += 1; //count = count +1;
		}
		System.out.println("1~10사이의 수의 갯수 : " + count);
		
		
		//프로그래밍 기초 알고리즘 : 누적 합계(누적), 누적 곱(누승)
		//(2) 1~100 사이의 홀수와 짝수의 합계
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1; i<=10; i++) {
			if (i%2 == 1) {
				oddSum += i; //참: 홀수 합계	
			} else {
				evenSum += i;//거짓 : 짝수 합계
			}
		}
		
		System.out.println("홀수의 합계 : " + oddSum );
		System.out.println("짝수의 합계 : " + evenSum );
	
		//(3)1~5(이사) 사이의 정수의 누적 곱셈의 결과
		int result = 1;
		for(int i = 1; i <= 5; i++)
			result *=i; //result = result*i;
	    System.out.println("1~5사이의 정수의 누적 곱셈 : " + result);
	    
	    //(4)누적 곱셈(누승) ->팩토리얼 : 5! = 5*4*3*2*1 = 1*2*3*4*5 = 120
	    int fac = 1;
	    for(int n = 5; n >= 1; n--) {
	    	fac *= n;
	    }
	    System.out.println("5! : " + fac);
	    
	    //(5)for문 1개를 이용하여 다음과 같이 출력하기
	    //System.out.println(); //w줄바꿈(개형, newline)
	    //System.out.println("\n"); //줄바꿈(개형,newline)
	    
	    /*
	     ABCDE
	     FGHIJ
	     KLMNO
	     PQRST
	     UVWXY
	     Z
	     * 
	     */
	    int cnt = 1;
	    for(char ch = 'A'; ch <= 'Z'; ch++) {
	    	System.out.println(ch);
	    	if(cnt%5 == 0) {
	    		System.out.println();
	    	}
	    	cnt = cnt + 1;
	    }
	    System.out.println();
	    
	    
	    //(6)2023년 윤년 판단(윤년일까요?)
	    //    2023년 : 평년(2월28일)
	    //    2023년 : 윤년(2월29일)
	     int year = 400;
	     //윤년판단 : 조건식1 조건식2 조건식3
	     if((year%4 == 0) && (year%100 !=0)||(year%400==0)) //Year 가 윤년이니
	     {
	    	System.out.println("윤년");//참
	     }else {
	    	System.out.println("평년");//거짓 
	     }
	    //(7)서기 1년~2023년 까지 (이하) 사이의 윤년의 갯수(번, 개) 출력
	     int leapYear = 0;
	     for(int y = 1; y <= 2023; y++) {
	    	 if((y%4==0)&&(y%100!=0)||(y%400==0)) {
	    		 leapYear++;
	    	 }
	     }
	     
	     System.out.println("1~2023년 사이의 윤년의 갯수 : " + leapYear);
	    
	    
	    
	  
	    
  
     }//main()end
	
}//class()end