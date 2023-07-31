package oop20230717;

public class Break1 {

	public static void main(String[] args) {
		//1. 유한 for문 : 5회(번)"java"출력
		for(int i = 1 ; i<=5; i++) {
			System.out.println("JAVA");
		}
		//2.유한 while문 : 5회 (번) "Java"출력
		System.out.println();
		int i = 1 ;
		while(i<=5) {
			//i++
			System.out.println("JAVA" + i);
			i++;
		}
		//3.무한 while문 : 5회"java" 출력
		//int a = 0;
		int a = 0;
		while(true) {
			if(a == 5) {
				break;// beak문은 (while, for, switch) 괄호만 영향받음 
			}else {
				System.out.println("java");//반복대상
				a++;	
			}
			
		}//while()end
		//4.무한for문 : 5회 "java"출력
		a=0;
		for(;;) {
			if(a==5)break;
			System.out.println("java" + a);
			a++;
			
		}
	
		
		}//main()end

}//class()end
