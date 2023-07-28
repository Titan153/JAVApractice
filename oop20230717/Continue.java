package oop20230717;

public class Continue {
	public static void main(String[] args) {
		//break;    -->반복문 빠져 나갈떄 (switch, while, for)
		//continue; -->반복문 다시 복귀할 떄(while, for)
		//1(이상)~20(이하)까지의 자연수 중
		//2의 배수 또는 3의 배수를 "제외한" 자연수 출력
		for(int i = 1; i <= 20; i++) {
			if(i%2 == 0 || i%3 == 0) //2의 배수 : 출력 안함
				continue; //i++을 진행하고 조건식을 진행한다. if 문에는 유의미하다
			//}else {
			System.out.println(i);//2의 배수 아님: 출력 함
		}//for end
	}//main()end

}//class end
