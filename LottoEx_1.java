package oop20230718;

public class LottoEx_1 {
	
	public static void main(String[] args) {
		// 난수 생성(2) : 로또
		// 클래스명(파일명) : LottoEx.java
		// 처리순서 : 난수생성(45개의 숫자) -> 중복데이터 검사(단순if { break; }
		//[결과]
		//이번회차 로또 번호 : [23][41][21][19][34][22]
		// 더더더... 구현은
		// 본인입력한 번호와 이번회차 번호로 당첨 확인하기 구현
		int[] Lotto = new int[45];
		for(int i=0; i<Lotto.length; i++) {
			
			Lotto[i]=i+1;
		}//for i()end
		
		int temp;
		int j=0;
		for(int i=0; i<Lotto.length; i++) {
			j= (int)(Math.random()*45);
			temp=Lotto[i];
			Lotto[i]=Lotto[j];
			Lotto[j]=temp;
		}//for i()end
		
		System.out.print("이번회차 로또번호 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("[%2d]",Lotto[i]);
		}
		
		
	}//main()end

}//class()end
