package oop20230718;

public class Array6SelectionSort {
	
	public static void main(String[] args) {
		//(1)선택정렬(오름차순)
		int[]a = {11, 23, 7, 9, 14};
		System.out.println("===정렬 전===");
		for(int idx = 0; idx < 5; idx++) {
			System.out.printf("%5d",a[idx]);
		} 
		
		for(int i = 0; i<4; i++) {//총 회전(단계)수, 4단계(0,1,2,3)
			for(int j = i+1; j < 5; j++ ) {//각 회전에서의 비교 횟수(4회->3회->2회->1회)//i+1이라 한 이유는 0-4까지 5개 배열의수와 실제로 셀때의 1개-5개를 맟주기위함
				if(a[i] > a[j]) {  //앞 > 뒤 : 오름차순(작->큰)
					               //앞 < 뒤 : 내림차순(큰->작)
					//교환(Swap)
			    int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}//(j)for end
			System.out.printf("\n[%d 단계 후]", i+1);
			for(int idx = 0; idx <5; idx++) {
				System.out.printf("%5d", a[idx]);
			}
		}//(i) for end
		System.out.println();
		System.out.println("===정렬후===");
		for(int idx = 0; idx < 5; idx++) {
			System.out.printf("%5d",a[idx]);
		} 
	}//main()end
	
}//class()end
