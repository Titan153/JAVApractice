package oop20230724;

import java.util.Scanner;

public class MethodEx10_1 {
	
	public static int seqSearchString(String[] arr, int size, String key) {
		int idx = -1;
		for(int i = 0; i < size; i++) {
			if(key.equals(arr[i])) {
				idx = i;
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력 : ");
		
		int size = sc.nextInt();
		String[]arr = new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.next();
		}
		System.out.print("검색할 값 입력 : ");
		String key = sc.next();
		int idx = seqSearchString(arr, size, key);
		
		if(idx == -1) {
			System.out.println("검색실패 : 배열에 검색할 값이 없습니다.");
		}else {
			System.out.println("검색성공 : 배열 arr[" + idx + "]에 있습니다.");
		}
		sc.close();
		// 클래스명(파일명) : MethodEx10.java
		//main() 메서드가 실행되어​
		// [결과]와 같이 출력되도록,
		// seqSearchString 메서드를 정의(작성)하시오.
		// [HINT] 순차/선형 검색 알고리즘
		// [HINT] String 클래스의 equals() 메서드를 사용하여 문자열 비교
        //equals()는 문자열의 내용을 비교하여 같으면 true를 반환하고, 다르면 false를 반환합니다. 
        //이때 비교하는 것은 문자열이 가지고 있는 값을 비교합니다.​
		/*​​
		검색할 값 입력 : 강길동 (엔터)
		검색실패 : 배열에 검색할 값이 없습니다.
		​​[결과][2]
		배열의 길이를 입력 : 6 (엔터)
		arr[0] : 홍길동 (엔터)
		arr[1] : 최길동 (엔터)
		arr[2] : 김길동 (엔터)
		arr[3] : 박길동 (엔터)
		arr[4] : 조길동  (엔터)
		arr[5] : 강길동  (엔터)
		검색할 값 입력 : 강길동 (엔터)
		검색성공 : 배열 arr[5]에 있습니다.
		*/
	}//main()end

}//class()end
