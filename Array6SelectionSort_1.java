package oop20230718;

public class Array6SelectionSort_1 {

	public static void main(String[] args) {
		// 선택정렬(오름차순)
		int[]a= {11,23,7,9,14};
		System.out.println("============정렬 전===========");
		for(int idx=0; idx<5; idx++) {
			System.out.printf("%5d",a[idx]);
			
		}//for idx()end
		
		for(int i=0; i<4; i++) {//총 회전(단계)수, 4단계(0,1,2,3,) 배열a길이 5니까 5-1해서 4번
			for(int j=i+1; j<5; j++) {//각 회전에서의 비교 횟수(4회 -> 3회 -> 2회 -> 1회)
			 if(a[i]>a[j]) {
				 int temp = a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		  }//(j)forend
		
		System.out.printf("\n[%d 단계 후]", i+1);
		for(int idx = 0; idx<5; idx++) {
			System.out.printf("%5d", a[idx]);
		 }//(idx)for end
		
		}//(i)for end
		System.out.println();
		System.out.println("============정렬 후===========");
		for(int idx=0; idx<5; idx++) {
			System.out.printf("%5d", a[idx]);
		}

	}//main()end

}//class()end
