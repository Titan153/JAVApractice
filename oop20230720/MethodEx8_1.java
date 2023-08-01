package oop20230720;

import java.util.Scanner;

public class MethodEx8_1 {
	
	public static  int seqSearch(int[] arr, int size, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) { 
				return i;
			}else { 
				return -1;
			}
		}	
	}//seqSerch()end

	public static void main(String[] args) {
		// 클래스명(파일명) : MethodEx8.java
		// 다음의 main() 메서드가 실행되어​
		// [결과]와 같이 출력되도록,
		// seqSearch 메서드를 정의(작성)하시오.
		// [HINT] 순차/선형 검색 알고리즘 : https://biology-statistics-programming.tistory.com/48
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력 : ");
		
		int size = sc.nextInt();
		int[]arr = new int[size];
		
		for(int i = 0; i <size; i++) {
			System.out.println("arr[" + i +  "] : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("검색할 값 입력 : ");
		int key = sc.nextInt();
		
		int idx = seqSearch(arr, size, key);
		
		if(idx == -1) {
			System.out.println("검색실패 : 배열에 검색할 값이 없습니다.");
		}else {
			System.out.println("검색성공 : 배열 arr[" + idx + "]에 있습니다.");
		}
		sc.close();
		
	}//main()end

}//class()end
