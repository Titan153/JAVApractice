package oop20230720;

public class Method7 {
	
	public static void swapCBV(int a, int b){///여기 a,b는<<<
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("실행됨");//Call By Value 됬기때문에 사본처리됬다고 이해하면됨 
	}                              //사본에 대해서만 처리한다 그래서 등장한게 Call by reference
	public static void swapCBR(int[] n) {//참조변수 int[] n = n; 주소를 찾아가도록함
		int temp;                        //만약 변수가 바뀌면 당연히 이 주소정보는 사라짐
		temp = n[0];
		n[0] = n[1];
		n[1] = temp;
		System.out.println("실행됨");
	}
	
	public static void main(String[] args) {//여기 a,b 애들<<<이랑 지역이 다름
		//두 변수의 교환
		int a = 30;
		int b = 50;
		System.out.println("===Call by value :교환 실패===");
		System.out.println("교환 전 : " + a + " " + b);
		swapCBV(a,b);//call by value
		System.out.println("교환 후 : " + a + " " + b);
		
		int[] n = {30,50};   // n[0] = 30; n[1] = 50;
		System.out.println("===Call by reference :교환 성공===");
		System.out.println("교환 전 : " + n[0] + " " + n[1]);
		swapCBR(n);//call by reference (n)참조변수
		System.out.println("교환 후 : " + n[0] + " " + n[1]);
	}//main()end
	
}//class()end
