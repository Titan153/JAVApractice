package oop20230807;

import java.util.ArrayList;

class Jumsu{
	String name = "";
	int kor, eng, tot, avg;
	
	public Jumsu() {
		super();
	}
	
	public Jumsu(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		this.avg = (kor + eng) /2;
	}
}
public class ArrayListEx1 {

	public static void main(String[] args) {
		Jumsu s1 = new Jumsu("김철수", 100, 70);
		Jumsu s2 = new Jumsu("박철수", 80, 80);
		Jumsu s3 = new Jumsu("홍철수", 70, 70);
		
		ArrayList arrList = new ArrayList();
		arrList.add(s1);
		arrList.add(s3);
		arrList.add(s2);
		
		int size = arrList.size();
		Jumsu s = null;
		for(int i = 0; i < size; i++) {
			s = (Jumsu)arrList.get(i);
			System.out.print(s.name + "\t");
			System.out.print(s.kor + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.tot + "\t");
			System.out.print(s.avg + "\t\n");
			
		}
		
		

	}//main() end

}//class end
