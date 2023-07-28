package oop20230717;

public class Array2 {
	public static void main(String[] agrs) {
		int kor = 10;
		int eng = 40;
		int math = 50;
		int total = kor + eng + math;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		//배열(명)            3개, 요소의 갯수, 배열의 크기, 정수
		//int hongScore[] = {10, 40, 50};
		int[] hongScore = {10, 40, 50};//4byte x 3 -> 12byte
		System.out.println("배열의 크기 : " + hongScore.length);
		//인덱스, 위치, ~번째
		hongScore[0] = 10;
		hongScore[1] = 40;
		hongScore[2] = 50;
		//hongScore[3] = 100; //java.lang.ArrayIndexOutOfBoundsException //범위를 넘었다
	    //배열 크기 --> 배열명.length
		for(int i = 0; i < hongScore.length; i++) {
			System.out.println(hongScore[i]);
		}
		 
		//double[] d;                           //(1) 참조형 변수 선언문;
		//d = new double[] {1.1, 2.2, 3.3};     //(2) 변수 대입문;
		
		//double[] d = new double[] {1.1, 2.2, 3.3}; //배열초기화
		double[] d = {1.1, 2.2, 3.3};    //8byte x 3 -> 24byte
		
		//      배열의 인덱스는 : 0부터 시작 ~(배열의크기-1) 까지 
		//      index, 인덱스, 위치, ~번쨰
		//배열명 [첨자] 
		d[0] = 5.5;
		System.out.println(d[0]);
		int size = d.length;
		for(int i = 0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		char[] ch  = {'H', 'a', 'p', 'p','y'};//2byte x 5 -> 10byte
		size = ch.length;
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		String[] season = {"봄", "여름", "가을", "겨울"};// new String 생략가능
		size = season.length;
		for(int i = 0; i < size; i++) {
			System.out.println(season[i]);
		}
		
		//향상된 for(each-for) : 배열의 요소를 접근 (참조),차례대로 "모든 요소" -> "순회"
		for(String data : season) {
			System.out.println(data);
		}
		
		//한 영어단어 내에 모음의 갯수 : A E I O U a e i o u
		char[]word = {'H', 'a', 'p', 'p', 'y'};
		int moCnt = 0;
		
		for(int i = 0; i < word.length; i++) {
			char c = word[i];
			//if(word[i] >= 'A' && word[i] <= 'Z')
			if(c >= 'A' && c <= 'Z')//알파벳 대문자입니까?
				c = (char)(c+32);   //대문자를 소문자로 변환
			//단어내의 모음 문자 소문자 판별(구별)
			switch(c) {
			case'a': case'e': case'i': case'o': case'u': 
				moCnt++;
			}
			
		}//for end
		System.out.println("단어 내의 모음의 갯수 : " + moCnt);
		
		
		
		
		
		
	}//main()end
	

}//class()end
