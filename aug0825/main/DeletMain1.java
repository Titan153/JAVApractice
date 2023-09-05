package com.titanium.aug0825.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletMain1 {
	public static void main(String[] args) {
		// 상품명 입력(Scanner) => 입력한 내용을 포함하는 상품명의 정보를 삭제 
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(addr, "BS", "1234");
			
			
			Scanner k = new Scanner(System.in);
			System.out.print("상품명: ");
			String name = k.next();
			
			k.close();
			// 문제점 : 여기는 자바의 영역... %를 문자로 바꿔야됨 !
			// %를 문자로 만들어서 문자들을 연결시켜주는 파이프를 사용 ||
			String sql = "DELETE FROM VEGETABLE WHERE V_NAME LIKE '%'||?||'%'" ;
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			//전송/실행/결과 받기
			int dataCount = pstmt.executeUpdate();
			// 성공메세지
			if (dataCount >= 1) {
				System.out.println("Delete Success !");
			} else {
				System.out.println("존재하지않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
