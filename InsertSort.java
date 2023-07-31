package oop20230718;

public class InsertSort {

	public static void main(String[] args) {
		// 삽입정렬
		// 클래스명(파일명) : InsertSort.java
		// [삽입법] 삽입정렬 개념을 학습 후, {SWAP코드 없음)(배열내의 위치이동)
		// 삽입정렬을 이용하여 배열 a의 오름차순과 내림차순한 결과를 출력하시오.
		// int[] a = {11, 23, 7, 9, 14};
		//[결과]
		//오름차순 : 7 9 11 14 23
		//내림차순 : 23 14 11 9 7
		int[] a = {11, 23, 7, 9, 14};
		
		int key = 0;  //삽입 정렬의 키(삽입대상) 
		int p = 0;
		//1부터 마지막 원소까지 순회
		for(int i = 1; i < a.length; i++) { //총 회전(단계)수, 3단꼐(1,2,3)배열["정렬0"key"정렬x"]
			key = a[i];//각 회전에서 삽입할 key 값 지정
			p = i - 1;
			//0번쨰 원소까지 비교: 진행방향(0)번째<-----(p)(i)번쨰
			while(p >=0 && a[p] > key) {//0번쨰 인덱스까지 비교 && 오름차순
				a[p + 1] = a[p];
				p--;
		
			}//while()end
			//위 반복문에서 탈출하는 경우는
			//타겟원소는 p 뒤순서에 와야한다
			//그러므로 타겟은 p+1에 위치하게 된다
			a[p + 1] = key;//현재 p+1 위치에 temp값에 넣었던 arr[i]값을 넣어줍니다.
		}//for i () end
		System.out.println();
		System.out.println("==========정렬 후==========");
		for(int idx = 0; idx <5; idx++) {
			System.out.printf("%5d", a[idx]);
		}

	}

}
