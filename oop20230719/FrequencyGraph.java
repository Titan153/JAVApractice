package oop20230719;

public class FrequencyGraph {

	public static void main(String[] args) {
		// 클래스명(파일명) : FrequencyGraph.java
		// 난수값(100개)생성후, 빈도수에 따른 그래프그리기
		// 난수 범위 : 0이상 ~ 9이하 (Math.random()*9)+1
		// [HINT]
		//int[] number = new int[100];
		//int[] counter = new int[10];​
		int[] number = new int[100];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*10);//double을 int로 강제 변환시켜서 값손실유도
			System.out.print(number[i]);
		}
		System.out.println();
		//여기까지는 number배열 각 자리에 0-9까지의 랜덤숫자 100번 입력
		//number배열 안의 각 값들은 0-9까지 중에 랜덤으로 출력
		
		int[] counter = new int[10];//0부터 9까지의 숫자가 몇번 입력되었는지 카운트하기위한 counter배열 
		
		for(int i = 0; i <number.length; i++) {
			//counter[number[i]]++;//counter[number[i]값은0-9]
		 switch(number[i]) {
		 case 0: counter[0]++;
		 break;
		 case 1: counter[1]++;
		 break;
		 case 2: counter[2]++;
		 break;
		 case 3: counter[3]++;
		 break;
		 case 4: counter[4]++;
		 break;		 
		 case 5: counter[5]++;
		 break;
		 case 6: counter[6]++;
		 break;
		 case 7: counter[7]++;
		 break;
		 case 8: counter[8]++;
		 break;
		 case 9: counter[9]++;
		 break;
		 }
		 
		}//for i()end
		
		for(int i=0; i<counter.length; i++) {
			System.out.printf("%2d : ", i);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("&");
			}
			System.out.println(" "+ counter[i]+"회");
		}//for i()end
		

	}//main()end

}//class()end
