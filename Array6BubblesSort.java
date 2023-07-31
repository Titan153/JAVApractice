package oop20230718;

public class Array6BubblesSort {

	public static void main(String[] args) {
		
		int[]a = {11, 23, 7, 9, 14};
		System.out.println("============정렬 전===========");
		for(int idx = 0; idx < 5; idx++) {
			System.out.printf("%5d",a[idx]);
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.printf("\n[%d 단계 후]", i+1);
			for(int idx = 0; idx < 5; idx++) {
				System.out.printf("%5d", a[idx]);
			}
		}
		System.out.println();
		System.out.println("============정렬 후===========");
		for(int idx = 0; idx < 5; idx++) {
			System.out.printf("%5d",a[idx]);
		}
		

	}//main()end

}//class()end
