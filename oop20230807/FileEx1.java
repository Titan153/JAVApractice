package oop20230807;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		try {
			String fileName = "C:/Users/bbung/eclipse-workspace/oopjava/src/oop20230807/data1.txt";
			File file = new File(fileName);
			
			if(file.exists()) {//파일의 존재 유무 확인
				//파일크기(byte)
			System.out.println(file.length() + "byte(s)");	
			//파일명
			System.out.println(file.getName());
			//파일의 저장 경로(물리적 경로)(절대경로)
			System.out.println(file.getPath());
			//파일 삭제
			file.delete();
			System.out.println("파일이 삭제되었습니다.");
			}else {
				System.out.println("파일이 존재하지 않음");
			}
		}catch(Exception e) {
			System.out.println("파일 입출력 실패 : " + e);
		}

	}

}
/*===파일 입출력====
*0)txt 파일 생성 : data1.txt
*1)파일 열기
*2)파일 쓰기 또는 읽기
*3)파일 닫기
*
*/