package oop20230807;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEx2 {

	public static void main(String[] args) throws Exception{
		// 파일복사 : (원본)파일의 내용을(사본)파일에 저장하기
		//(원본)파일 : score.txt
		//(사본)파일 : out.txt
		String fileName1 = "C:/Users/bbung/eclipse-workspace/oopjava/src/oop20230807/score.txt";
		String fileName2 = "C:/Users/bbung/eclipse-workspace/oopjava/src/oop20230807/out.txt";
		
		Scanner sc = new Scanner(new File(fileName1));
		PrintWriter pw = new PrintWriter(new File(fileName2));
		
		String str1 = "";//라인단위 임시저장(메모리, 각 라인 읽기용)
		String str2 = "";//"한"라인 "한글자씩"누적(연결) 처리용 초기화
		while(sc.hasNextLine()) {
			str1 = sc.nextLine();
			int size = str1.length();
			str2 = "";
			//파일(str1)의 내용을 파일(str2)에 저장하기
			for(int i=0; i<size; i++) {
				str2 += str1.charAt(i);
			}
			System.out.println(str1);//콘솔출력//확인용
			pw.println(str2);				//파일 출력(쓰기)
		}
		sc.close();
		pw.close();
	}//main() end

}
