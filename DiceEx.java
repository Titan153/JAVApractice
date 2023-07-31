package oop20230718;

public class DiceEx {

	public static void main(String[] args) {
		// 난수 생성(1) : 주사위 굴리기
		// 클래스명(파일명) : DiceEx.java
		// 주사위를 20번 굴려 나온 눈금값의
		
		// 각 눈금의 횟수를 출력
		// [HINT] 1차원배열 int[] d = new int[6]; 
		//[결과]
		//눈금1 : 5회 
		//눈금2 : 2회
		//눈금3 : 1회
		//눈금4 : 3회
		//눈금5 : 4회
		//눈금6 : 5회
		int[] dice = new int [6];
		//       첨자     0  1  2  3  4  5 
		//int[] dice = {0, 0, 0, 0, 0, 0}; <--- 눈금값 갯수
		//       눈금     1  2  3  4  5  6 
		//런했을떄 맨첨 수가 3이 나오면 dice[2] = dice[2]+1 //dice[2]++;                    
		
		
		int num;
		for(int i = 0; i < 20; i++) { //20회
			// (1) 주사위 굴리기
			num = (int)(Math.random()*6)+1;
			System.out.print(num + " ");
			// (2) 눈금확인 후 빈도(1증가)
			dice[num-1]++;   //dice[num-1] = dice[num-1] - 1;
			
			//
			//switch(num) {
			//case 1: dice[0] ++ break;
			//case 2: dice[1] ++ break;
			//case 3: dice[2] ++ break;
			//case 4: dice[3] ++ break;
			//case 5: dice[4] ++ break;
			//case 6: dice[5] ++ break;
			//}
		}
		
		System.out.println();
		for(int i = 0; i< dice.length; i++) {
			System.out.println("눈금" + (i+1) + " : " + dice[i] + "회");
		}
		
		
	}//main()end

}//class()end
