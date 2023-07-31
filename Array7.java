package oop20230718;

public class Array7 {
	
	public static void main(String[] args) {
		
		//(1)버블정렬(오름차순)
		int[]a = {11, 23, 7, 9, 14};
		System.out.println("===정렬 전===");
		for(int idx = 0; idx < 5; idx++) {
			System.out.printf("%5d",a[idx]);
		} 
		
		for(int i = 0; i < 4; i++) {//총 회전(단계)수, 4단계(0,1,2,3)
			for(int j = 0; j < 4-i; j++ ) {//각 회전에서의 비교 횟수(4회->3회->2회->1회)
				if(a[j] > a[j+1]) {  //앞 > 뒤 : 오름차순(작->큰)
					               //앞 < 뒤 : 내림차순(큰->작)
					//교환(Swap)
			    int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
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
	}

}
