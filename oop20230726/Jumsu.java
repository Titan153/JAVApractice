package oop20230726;

public class Jumsu {
	
	//필드
	private int no; 						//번호
	private String name;					//이름
	private int[] answer = new int[5];		//답안제출
	private char[] ox = new char[5];		//'o'또는 'x'
	public int score; 						//점수
	public int rank = 1;  					//등수
	//생성자
	public Jumsu() {//기본생성자 
		}			//실행클래스 : Jumsu s1 = new Jumsu(1, "홍길동", 1, 3, 1, 1, 4)
	
	public Jumsu(int no, String name, int a, int b, int c, int d, int e){//매개변수 생성자
		this.no = no;       //this : field와 지역변수를 구분하기 위함
		this.name = name;	
		this.answer[0] = a;	
		this.answer[1] = b;
		this.answer[2] = c;
		this.answer[3] = d;
		this.answer[4] = e;
		this.rank = 1;
	}//생성자 Jumsu end
	
	//OX를 구하기위한 메서드
	public void compute() {
		//OX구하기
		//한 문제당 20점씩 누적 : this.score
		//정답
		int[] dap = {3, 3, 3, 3, 3};
		for(int idx = 0; idx < dap.length; idx++) {
			if(dap[idx] == answer[idx]) {
				ox[idx] = 'O';
				score = score + 20;
			}else {
				ox[idx]='x';
			}
		}//for end
		
	}//compute method()end
	
	//출력을 위한 disp메서드
	public void disp() {
		System.out.print(this.no + " ");
		System.out.print(this.name + " ");
		System.out.print(this.ox[0] + " ");
		System.out.print(this.ox[1] + " ");
		System.out.print(this.ox[2] + " ");
		System.out.print(this.ox[3] + " ");
		System.out.print(this.ox[4] + " ");
		System.out.print(this.score + " ");
		System.out.print(this.rank + " ");
		System.out.println();
	
	}//disp()method end

}//Jumsu class end
