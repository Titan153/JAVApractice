package oop20230807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class InputEx1 {

	public static void main(String[] args) {
		//메모장 파일(txt) 내용읽기 -->콘솔에 출력
		//메모장 파일(txt) 내용읽기 -->파일에 저장(도전)
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			String fileName = "C:/Users/bbung/eclipse-workspace/oopjava/src/oop20230807/score.txt";
			
			//1)byte 기반 : 1byte
			FileInputStream fis = new FileInputStream(fileName);
			
			int data = 0;
			while(true) {
				data = fis.read();
				if(data==-1) {
					break;
				}
				System.out.println((char)data);
			}//while end
			
			//2)char 기반 : 2byte
			fr = new FileReader(fileName);
			data = 0;
			while(true) {
				data = fr.read();
				if(data ==-1) {
					break;
				}
				System.out.println((char)data);
			}
			//3)엔터기반
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String line = "";
			while(true) {
				line = br.readLine();
				if(line==null) {
					break;
				}System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("파일 읽기 실패" + e);
			
				
			}finally {
				try {
					br.close();
					fr.close();
				}catch(Exception e) {
					
			}
		} 

	}

}
