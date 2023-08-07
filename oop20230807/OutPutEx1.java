package oop20230807;

import java.io.FileWriter;
import java.io.PrintWriter;

public class OutPutEx1 {

	public static void main(String[] args) {
		//스트림(stream) : 데이터를 송수신 하기위한 통로
		// 				  "단방향", 입력스트림, 출력스트림
		//파일쓰기 : 출력용 스트림
		FileWriter fw = null;
		PrintWriter out = null;
		
		try {
			//C:/Users/bbung/eclipse-workspace/oopjava/src/oop20230807
			String fileName = "text.txt";
			
			//파일쓰기 모드에서 파일이 없으면 자동생성
			//true : 추가(append)
			//false : 덮어쓰기
			fw = new FileWriter(fileName, false);
			
			//autoflush : true 버퍼 클리어
			out = new PrintWriter(fw, true);
			//프로그램 내(안)의 데이터 메모장 -->메모장 파일(txt)로 저장(쓰기)
			System.out.println("==파일에 출력 시작 하겠습니다.==");
			out.println("홍길동,100,100,100");
			out.println("김길동,90,90,90");
			out.println("정길동,80,80,80");
			out.println("박길동,70,70,70");
			out.println("신길동,60,60,60");
			
			System.out.println(fileName + "에 성공적으로 저장완료 되었습니다.");
		}catch (Exception e) {
			System.out.println("파일 읽기 실패" + e);
			
				
			}finally {
				try {
					fw.close();
					out.close();
				}catch(Exception e) {
					
			}
		} 

		
	}//main() end

}
