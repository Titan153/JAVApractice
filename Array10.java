package oop20230718;

public class Array10 {
	
	public static void main(String[] args) {
		//1차원 배열의(참조변수)의 얕은 복사
		//   참조변수       객체(Object), 인스턴스(instance)
		int[] a = new int[3]; //배열 선언문;
		a[0] = 10;             //배열요소 대입문;
		a[1] = 20;
		a[2] = 30;
		
		int[]aa = new int[]	{10,20,30}; //배열 초기화;
		int[]bb = null;                 //참조변수 선언문;
		                                //null 널, 널 주소, null address
		//배열 얕은 복사
		bb = aa;
		
		System.out.println(aa[0]); //(결과) 10
		System.out.println(bb[0]); //(결과) 10
		System.out.println(bb[1]); //(결과) 20
		System.out.println(bb[2]); //(결과) 30
		
		aa[0]++;
		System.out.println(aa[0]); //(결과)11
		System.out.println(bb[0]); //(결과)11
		
		
		//배열의 깊은 복사(Deep Copy)
		//배열 객체(인스턴스)의 복사(원본, 사본)
		int[]cc = new int[3];
		//System.arraycopy() 메소드를 이용한 배열의 깊은 복사
		System.arraycopy(bb, 0, cc, 0, bb.length);
		for(int i = 0; i < cc.length; i++) {
			cc[i]= aa[i]; // 사본 = 원본;
		}
		cc[0]= 99;
		System.out.println(aa[0]);
		System.out.println(bb[0]);
		System.out.println(cc[0]);
	}//main()end

}//class()end
/*
===배열 얕은 복사
배열 참조변수(배열명)간의 복사는 배열 참조변수 자체만 복사
"배열의 인스턴스는 복사되지 않음"
2개의 배열 참조변수는 (1개)동일한 배열 인스턴스를 참조
배열 참조변수는 참조형이므로 배열 복사(=)하면 같은 메모리 영역(객체)을 참조함

*
*/