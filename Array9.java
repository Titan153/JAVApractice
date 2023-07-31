package oop20230718;

public class Array9 {
	
	public static void main(String[] args) {
		// 1차원 배열 : 선형(Linear)
		int[] arr1 = new int[] {11, 22, 33, 44, 55, 66};
		for(int i = 0; i < arr1.length; i++) {
			//i: 0,1,2,3,4,5
			System.out.println(arr1[i]);
		}
		
		//배열 전체 요소의 순회(0번지 요소에서 부터 차례대로 마지막 번지 요소까지 참조)
		//for (배열자료형 변수명:배열명)
		for (int value : arr1) {
			System.out.println(value);
		}
		for (int i : arr1) { // :뒤에있는 객체를 하나 뜯어오는 역할을함
			//i : 11, 22, 33, 44, 55, 66(배열의 요소 값)
			//arry[0]~~~              arr[5]
			System.out.println(i);
		}
		boolean[] arr2 = {true, true, false, true, false};
		for(boolean b : arr2) {
			System.out.println(b);
			if( b == true)
				System.out.println("합격");
			else
				System.out.println("불합격");
			
		}
		
	}//main()end

}//class()end
/*
 * ==향상된 for문 (for-each문, enhance for)==
 * -배열 객체에 저장된 "모든요소" 를 대상으로 하는
 * 연산, 참조 또는 탐색 작업을 할경우 사용
 * (+) 코드의 양이 절대적으로 감소
 * (+) 배열의 길이 정도를 직접 확인하고 입력할 필요 없음
 * 
 */
